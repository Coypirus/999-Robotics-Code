package org.usfirst.frc.team999.subsystems;
import edu.wpi.first.wpilibj.drive.*;

import org.usfirst.frc.team999.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
public class DriveTrain {
		
	//Singleton Implementation
	private static DriveTrain instance = null;
	protected DriveTrain() {
		//Exists only to defeat instantiation
	}
	public static DriveTrain getInstance() {
		if(instance == null) {
					instance = new DriveTrain();
			}
			return instance;
		}	
	
	Joysticks mJoysticks = Joysticks.getInstance();
	Constants mConstants = Constants.getInstance();
	//Starboard is right, port is left
	WPI_TalonSRX starboardFrontDriveMotor = new WPI_TalonSRX(3);
	WPI_TalonSRX starboardCenterDriveMotor = new WPI_TalonSRX(2);
	WPI_TalonSRX starboardRearDriveMotor = new WPI_TalonSRX(1);
	
	WPI_TalonSRX portFrontDriveMotor = new WPI_TalonSRX(14);
	WPI_TalonSRX portCenterDriveMotor = new WPI_TalonSRX(15);
	WPI_TalonSRX portRearDriveMotor = new WPI_TalonSRX(16);

	//These will be the exclusive controllers for our drive motors.
	SpeedControllerGroup portController = new SpeedControllerGroup(starboardFrontDriveMotor, starboardCenterDriveMotor, starboardFrontDriveMotor);
	SpeedControllerGroup starboardController = new SpeedControllerGroup(portFrontDriveMotor, portCenterDriveMotor, portRearDriveMotor);

	DifferentialDrive mDrive = new DifferentialDrive(portController, starboardController);
	
	public DifferentialDrive returnDrive() {
		return mDrive;
	}
	
	public void runArcadeDrive() {
		mDrive.arcadeDrive(mJoysticks.getForward(), mJoysticks.getTurn());
	}
	
	
	
}


