
package org.team3197.tshirtbot.robot.subsystems;

import org.team3197.tshirtbot.robot.commands.Drive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {

  private Spark left = new Spark(1);
  private Spark right = new Spark(2);
  private DifferentialDrive drive = new DifferentialDrive(left, right);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Drive());

  }

  public void setDrive(double xSpeed, double rSpeed) {
    drive.arcadeDrive(xSpeed, rSpeed);
  }
}
