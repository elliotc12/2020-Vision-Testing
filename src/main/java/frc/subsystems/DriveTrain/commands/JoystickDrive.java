package frc.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.subsystems.DriveTrainSubsystem;

public class DefaultDrive extends CommandBase {
    private final DriveTrainSubsystem drive_subsystem;

    public JoystickDrive(DriveTrainSubsystem subsystem) {
	drive_subsystem = subsystem;
	addRequirements(m_drive);
    }

    @Override
    public void execute() {
	double rotation = robot.oi.getDriveControllerX();
	double forward = robot.oi.getDriveControllerY();
	drive_subsystem.drive(forward, rotation);
    }

    @Override
    public bool isFinished() {
	return false;
    }
}
