package frc.subsystems.ball_holder.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ReleaseBall extends Command {
    public ReleaseBall() {
        super("ReleaseBall");
        requires(Robot.holder);
    }

    @Override
    protected void initialize() {
        Robot.holder.retractHoldLeft();
        Robot.holder.retractHoldRight();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

}
