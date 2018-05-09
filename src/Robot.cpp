/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

#include <Drive/DifferentialDrive.h>
#include <IterativeRobot.h>
#include <Joystick.h>
#include <Spark.h>
#include "WPILib.h"
//#include "ctre\phoenix\MotorControl\CAN\WPI_TalonSRX.h"
//#include "ctre/Phoenix.h"

class Robot: public frc::IterativeRobot {
//	WPI_TalonSRX* l = new WPI_TalonSRX(3);
//	WPI_TalonSRX* r = new WPI_TalonSRX(1);
//	WPI_TalonSRX* bl = new WPI_TalonSRX(4);
//	WPI_TalonSRX* br = new WPI_TalonSRX(2);
//	MecanumDrive rD = new MecanumDrive(l,r,bl,br);
	Spark* left = new Spark(0);
	Spark* right = new Spark(1);
	DifferentialDrive driveBoi = new DifferentialDrive(left, right);
	Joystick* j = new Joystick(0);

public:

	void TeleopInit() {
		//rD.DriveCartesian(j->GetRawAxis(4), j->GetRawAxis(5), j->GetRawAxis(0));
		driveBoi.ArcadeDrive(j->GetRawAxis(1), j->GetRawAxis(5));
	}
	void TeleopPeriodic() {



	}
};

START_ROBOT_CLASS(Robot)
