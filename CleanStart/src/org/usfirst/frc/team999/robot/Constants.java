package org.usfirst.frc.team999.robot;

import org.usfirst.frc.team999.subsystems.Joysticks;

public class Constants {
	
	//Singleton Implementation
	private static Constants instance = null;
	protected Constants() {
		//Exists only to defeat instantiation
	}
	public static Constants getInstance() {
		if(instance == null) {
					instance = new Constants();
			}
			return instance;
		}	
	
//Huge list of constants
/*	private static final double kWheelDiameter = 4.875;
	private static final double KSensorUnitsPerRotation = 4096;
	private static final double kRobotWidthInches = 34;
	private static final double kRobotLengthInches = 37;
	private static final int kTimeoutMs = 10;
	public static final double k100msPerMinute = 600.0;
	private static final double kIntakeHorizontalTiltAngle = 0.3; // Position: Horizontal
	private static final int kElevatorUp = 1;
	private static final int kElevatorDown = -1;
	private static final int kElevatorStop = 0;
	
	private static final double kIntakeTiltkP = 0.4;
	private static final double kIntakeTiltkI = 0;
	private static final double kIntakeTiltkD = 1;
	private static final double kIntakeTiltkF = 0.966796875;
	private static final double kIntakeTiltAccel = 300;	//Value in RPM
	private static final double kIntakeTiltCruiseVelocity = 150;	//Value in RPM/s
	
	private static final double kElevatorkP = 0.4;
	private static final double kElevatorkI = 0;
	private static final double kElevatorkD = 1;
	private static final double kElevatorkF = 0.399609375;
	private static final double kElevatorAccel = 700;	//Value in RPM
	private static final double kElevatorCruiseVelocity = 375;	//Value in RPM/s
	private static final double kElevatorMaxEnc = 13800;
	private static final double kElevatorMinEnc = 0;
	private static final int clockWise = 1;
	private static final int counterClockWise = -1;
	*/
	
	public static final int ElevatorMax = 13800; // highest elevator can go before hitting stops
	public static final int ElevatorMin = 0;
	
	
}
