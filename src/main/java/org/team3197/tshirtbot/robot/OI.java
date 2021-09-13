package org.team3197.tshirtbot.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public final class OI {
    private static double turnMultiplier = .5;
    private static XboxController joystick = new XboxController(0);

    public static final double xSpeed() {
        return joystick.getY(Hand.kRight);
    }

    public static final double rSpeed() {
        return joystick.getX(Hand.kRight);
    }

    public static final double pitchSpeed() {
        return joystick.getY(Hand.kLeft);
    }

    public static final double yawSpeed() {
        return joystick.getX(Hand.kLeft) * turnMultiplier;
    }

    public static final boolean getShoot() {
        return joystick.getAButton();
    }
}