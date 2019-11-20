package frc.subsystems.ball_holder.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class HoldBall extends Command {
    public HoldBall() {
        super("HoldBall");
        requires(Robot.holder);
    }

    @Override
    protected void initialize() {
        Robot.holder.extendHoldLeft();
        Robot.holder.extendHoldRight();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

}
