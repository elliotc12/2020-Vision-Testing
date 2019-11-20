package frc.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveCurvature extends Command {
    public DriveCurvature() {
        super("DriveCurvature");
        requires(Robot.drive);
    }

    @Override
    protected void execute() {
        double throttle = Robot.oi.leftY();
        double rotation = Robot.oi.rightX();
        boolean isQuickTurn = Robot.oi.drive_left_bumper.get();
        System.out.println("Running drive");
        Robot.drive.drive(throttle, rotation, isQuickTurn);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void interrupted() {
        Robot.drive.drive(0, 0, false);
    }
}
