#include "WPILib.h"

class Robot: public frc::IterativeRobot {
public:
	Spark* left = new Spark(0);
	Spark* right = new Spark(1);
	DifferentialDrive drive = new DifferentialDrive(left, right);
	Joystick* j = new Joystick(0);

	void TeleopInit() {
	}
	void TeleopPeriodic() {
		drive.ArcadeDrive(j->GetRawAxis(1), j->GetRawAxis(5));
	}
};

START_ROBOT_CLASS(Robot)
