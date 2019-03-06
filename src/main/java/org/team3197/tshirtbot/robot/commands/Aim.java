
package org.team3197.tshirtbot.robot.commands;

import org.team3197.tshirtbot.robot.OI;
import org.team3197.tshirtbot.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Aim extends Command {
  public Aim() {
    requires(Robot.turret);
  }

  @Override
  protected void execute() {
    Robot.turret.setPitch(OI.pitchSpeed());
    Robot.turret.setYaw(OI.yawSpeed());
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.turret.setPitch(0);
    Robot.turret.setYaw(0);
  }
}
