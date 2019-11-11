package frc.subsystems.shooter.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShootToLeft extends Command {
    Timer timer;
    double TIME_TO_WAIT_IN_SECONDS = 0.5;

    public ShootToLeft() {
        requires(Robot.shooter);
    }

    @Override
    protected void initialize() {
        Robot.shooter.extendShootLeft();
        timer = new Timer();
        timer.start();
    }

    @Override
    protected boolean isFinished() {
        return timer.get() > TIME_TO_WAIT_IN_SECONDS;
    }

    //TODO: See if its retracted when another command requires the system, or if you need to use interrupted()
    @Override
    protected void end() {
        Robot.shooter.retractShootLeft();
    }
}
