package frc.subsystems.DriveTrainSubsystem.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.Robot;
import frc.subsystems.DriveTrainSubsystem.DriveTrainSubsystem;

public class JoystickDrive extends CommandBase {
    private final DriveTrainSubsystem drive_subsystem;

    public JoystickDrive(DriveTrainSubsystem subsystem) {
	drive_subsystem = subsystem;
	addRequirements(drive_subsystem);
    }

    @Override
    public void execute() {
	    double rotation = Robot.oi.getDriveControllerX();
	    double forward = Robot.oi.getDriveControllerY();
	    drive_subsystem.drive(forward, rotation);
    }

    @Override
    public boolean isFinished() {
	return false;
    }
}
