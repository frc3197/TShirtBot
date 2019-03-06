
package org.team3197.tshirtbot.robot.commands;

import org.team3197.tshirtbot.robot.OI;
import org.team3197.tshirtbot.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {
  public Shoot() {
    requires(Robot.barrel);
  }

  @Override
  protected void execute() {
    Robot.barrel.setCannon(OI.getShoot());
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.barrel.setCannon(false);
  }
}
