#include "WPILib.h"

class Robot: public frc::IterativeRobot {
public:
	Spark* left = new Spark(1);
	Spark* right = new Spark(2);

	Spark* turretPitch = new Spark(3);
	Spark* turretYaw = new Spark(4);

	DifferentialDrive* drive = new DifferentialDrive(*left, *right);
	Joystick* j = new Joystick(0);

	void TeleopInit() override {
	}
	void TeleopPeriodic() override{
		drive->TankDrive(j->GetRawAxis(5), j->GetRawAxis(1));
		turretPitch->Set((j->GetRawButton(6) ? 1 : (j->GetRawButton(5)) ? -1 : 0)); //rb right lb left
		turretYaw->Set(j->GetRawAxis(3) - j->GetRawAxis(2)); //rb right lb left


	}
};

START_ROBOT_CLASS(Robot)
