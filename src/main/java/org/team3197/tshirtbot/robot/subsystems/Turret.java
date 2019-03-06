
package org.team3197.tshirtbot.robot.subsystems;

import org.team3197.tshirtbot.robot.commands.Aim;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Turret extends Subsystem {

  private Spark pitch = new Spark(3);
  private Spark yaw = new Spark(4);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Aim());
  }

  public void setPitch(double pitchSpeed) {
    pitch.set(pitchSpeed);
  }

  public void setYaw(double yawSpeed) {
    yaw.set(yawSpeed);
  }
}
