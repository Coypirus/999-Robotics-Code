package org.usfirst.frc.team999.subsystems;

import org.usfirst.frc.team999.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Intake {
	
	//Singleton Implementation
	private static Intake instance = null;
	protected Intake() {
		//Exists only to defeat instantiation
	}
	public static Intake getInstance() {
		if (instance == null) {
			instance = new Intake();
			}
			return instance;
		}	

	Joysticks mJoysticks = Joysticks.getInstance();
	Constants mConstants = Constants.getInstance();

	WPI_TalonSRX portIntakeMotor = new WPI_TalonSRX(10);
	WPI_TalonSRX intakeRotatorMotor = new WPI_TalonSRX(11);
	WPI_TalonSRX starboardIntakeMotor = new WPI_TalonSRX(12);

	
}
