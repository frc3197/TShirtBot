package org.team3197.tshirtbot.robot.commands;

import org.team3197.tshirtbot.robot.OI;
import org.team3197.tshirtbot.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
  public Drive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void execute() {
    Robot.driveTrain.setDrive(OI.xSpeed(), OI.rSpeed());

  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.driveTrain.setDrive(0, 0);

  }
}
