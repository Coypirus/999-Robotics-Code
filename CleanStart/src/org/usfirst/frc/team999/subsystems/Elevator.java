package org.usfirst.frc.team999.subsystems;

import org.usfirst.frc.team999.robot.Constants;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Elevator {
	
	//Singleton Implementation
	private static Elevator instance = null;
	protected Elevator() {
		//Exists only to defeat instantiation
	}
	public static Elevator getInstance() {
		if(instance == null) {
					instance = new Elevator();
			}
			return instance;
	}	

	
	Joysticks mJoysticks = Joysticks.getInstance();
	Constants mConstants = Constants.getInstance();
	WPI_TalonSRX elevatorMotor = new WPI_TalonSRX(8);
	
	
	public WPI_TalonSRX getElevatorMotor(){
		return elevatorMotor;
	}
	
	public void configElevatorEncoder() { 
		//For auto initialization
		elevatorMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);// Set Relative
		elevatorMotor.setSelectedSensorPosition(0, 0, 10); //Set default sensor Position
	}
	
	public void checkElevator() {
		
		boolean elevatorUp = mJoysticks.getElevatorUp();
		boolean elevatorDown = mJoysticks.getElevatorDown();
		
		if (elevatorUp && elevatorDown) {
			//Do nothing
		}
		else if (elevatorUp && !elevatorDown && elevatorMotor.getSelectedSensorPosition(0)<mConstants.ElevatorMax){
			elevatorMotor.set(.5);
		}
		
		else if (!elevatorUp && elevatorDown && elevatorMotor.getSelectedSensorPosition(0)>mConstants.ElevatorMin) {
			elevatorMotor.set(-.35);
		}
		else {
			elevatorMotor.set(0);
		}
	}
	
}
