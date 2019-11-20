package frc.subsystems.shooter.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.subsystems.ball_holder.commands.HoldBall;
import frc.subsystems.ball_holder.commands.ReleaseBall;

public class TempShootToLeft extends CommandGroup {
    public TempShootToLeft() {
        super("TempShootToLeft");
        addSequential(new ReleaseBall());
        addSequential(new ShootToLeft());
        addSequential(new HoldBall());
    }
}
