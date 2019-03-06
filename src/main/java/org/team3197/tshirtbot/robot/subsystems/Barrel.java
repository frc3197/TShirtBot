
package org.team3197.tshirtbot.robot.subsystems;

import org.team3197.tshirtbot.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Barrel extends Subsystem {

  private Relay cannon = new Relay(1, Direction.kBoth);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Shoot());
  }

  public void setCannon(boolean shoot) {
    cannon.set((shoot) ? Value.kOn : Value.kOff);
  }
}
