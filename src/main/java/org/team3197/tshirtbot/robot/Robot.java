
package org.team3197.tshirtbot.robot;

import org.team3197.tshirtbot.robot.subsystems.Barrel;
import org.team3197.tshirtbot.robot.subsystems.DriveTrain;
import org.team3197.tshirtbot.robot.subsystems.Turret;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  public static Barrel barrel = new Barrel();
  public static DriveTrain driveTrain = new DriveTrain();
  public static Turret turret = new Turret();
}
