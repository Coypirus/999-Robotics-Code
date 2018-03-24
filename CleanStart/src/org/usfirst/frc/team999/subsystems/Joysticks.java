package org.usfirst.frc.team999.subsystems;

import edu.wpi.first.wpilibj.Joystick;

public class Joysticks {
	
	//Singleton Implementation
	private static Joysticks instance = null;
	protected Joysticks() {
		//Exists only to defeat instantiation
	}
	public static Joysticks getInstance() {
		if(instance == null) {
					instance = new Joysticks();
			}
			return instance;
		}	
	
	Joystick leftStick = new Joystick(0);
	Joystick rightStick = new Joystick(1);
	

	double forward;
	double turn;
	boolean intakeCube = leftStick.getRawButton(1);
	boolean outtakeCube = rightStick.getRawButton(1);//right 1
	boolean rotateIntakeIntoBot = leftStick.getRawButton(6);
	boolean rotateIntakeOutOfBot = leftStick.getRawButton(4);
	boolean elevatorUp = rightStick.getRawButton(5);
	boolean elevatorDown = rightStick.getRawButton(3);
	boolean IntakeArmsOut = rightStick.getRawButton(2);
	
	public void UpdateJoystickValues() {
		forward = leftStick.getRawAxis(0);
		turn = rightStick.getRawAxis(1);
		intakeCube = leftStick.getRawButton(1);
		outtakeCube = rightStick.getRawButton(1);//right 1
		rotateIntakeIntoBot = leftStick.getRawButton(6);
		rotateIntakeOutOfBot = leftStick.getRawButton(4);
		elevatorUp = rightStick.getRawButton(5);
		elevatorDown = rightStick.getRawButton(3);
		IntakeArmsOut = rightStick.getRawButton(2);
	}
	
	public double getForward() {
		return forward;
	}

	public double getTurn() {
		return turn;
	}

	public boolean getElevatorUp() {
		return elevatorUp;
	}
	
	public boolean getElevatorDown() {
		return elevatorDown;
	}

}



/*
boolean intakeTrigger = leftStick.getRawButton(1);
boolean outtakeTrigger = rightStick.getRawButton(1);	
boolean climberCylinderToggle = leftStick.getRawButton(2); 
boolean intakePivotDownButton = leftStick.getRawButton(4);
boolean intakePivotUpButton = leftStick.getRawButton(6);	
boolean leftClimberExtend = leftStick.getRawButton(5);
boolean leftClimberRetract = leftStick.getRawButton(3);
boolean intakeArmsToggleButton = rightStick.getRawButton(2);
boolean elevatorDown = rightStick.getRawButton(3);
boolean rightClimberRetract = rightStick.getRawButton(4);
boolean elevatorUp = rightStick.getRawButton(5);
boolean rightClimberExtend = rightStick.getRawButton(6);
boolean bothClimbersExtend = rightStick.getRawButton(11);
boolean bothClimbersRetract = rightStick.getRawButton(12);
boolean compressorToggle = coPilotStick.getRawButton(2);
boolean coPilotLeftClimberRetract = coPilotStick.getRawButton(3);
boolean coPilotRightClimberRetract = coPilotStick.getRawButton(4);
boolean coPilotLeftClimberExtend = coPilotStick.getRawButton(5);
boolean coPilotRightClimberExtend = coPilotStick.getRawButton(6);
boolean coPilotBothClimberExtend = coPilotStick.getRawButton(9);
boolean coPilotBothClimberRetract = coPilotStick.getRawButton(10);
boolean coPilotClimberCylinderToggle = coPilotStick.getRawButton(11);
*/
