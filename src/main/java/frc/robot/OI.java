package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.subsystems.ball_holder.commands.HoldBall;
import frc.subsystems.ball_holder.commands.ReleaseBall;
import frc.subsystems.shooter.commands.ShootToRight;
import frc.subsystems.shooter.commands.TempShootToLeft;

public class OI {

    public JoystickButton driveA, driveB, drive_left_bumper;
    public JoystickButton manipA, manipB, manipX, manipY;
    private XboxController driveController, manipController;

    public OI() {
        initControllers();
        manipA.whenReleased(new TempShootToLeft());
        manipB.whenReleased(new ShootToRight());
        manipX.whenReleased(new ReleaseBall());
        manipY.whenReleased(new HoldBall());

    }

    private void initControllers() {
        driveController = new XboxController(0);
        driveA = new JoystickButton(driveController, XboxButton.kA.value);
        driveB = new JoystickButton(driveController, XboxButton.kB.value);
        drive_left_bumper = new JoystickButton(driveController, XboxButton.kBumperLeft.value);

        manipController = new XboxController(1);
        manipA = new JoystickButton(manipController, XboxButton.kA.value);
        manipB = new JoystickButton(manipController, XboxButton.kB.value);
        manipX = new JoystickButton(manipController, XboxButton.kX.value);
        manipY = new JoystickButton(manipController, XboxButton.kY.value);

    }

    public double leftY() {
        return -1 * driveController.getY(GenericHID.Hand.kLeft);
    }

    public double rightX() {
        return driveController.getX(GenericHID.Hand.kRight);
    }

    //TODO: Once wpilib2020 is released, remove this because the XboxController Button Enum is public
    private enum XboxButton {
        kBumperLeft(5),
        kBumperRight(6),
        kStickLeft(9),
        kStickRight(10),
        kA(1),
        kB(2),
        kX(3),
        kY(4),
        kBack(7),
        kStart(8);

        @SuppressWarnings({"MemberName", "PMD.SingularField"})
        private final int value;

        XboxButton(int value) {
            this.value = value;
        }
    }
}
