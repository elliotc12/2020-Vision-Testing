package frc.subsystems.drivetrain;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.subsystems.drivetrain.commands.DriveCurvature;

import static frc.robot.RobotMap.*;

public class Drivetrain extends Subsystem {
    SpeedController leftA, leftB, leftC;
    SpeedControllerGroup leftDrive;
    SpeedController rightA, rightB, rightC;
    SpeedControllerGroup rightDrive;

    DifferentialDrive drive;

    public Drivetrain() {
        leftA = new CANSparkMax(can_LEFT_DRIVE_MOTOR_A, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftB = new CANSparkMax(can_LEFT_DRIVE_MOTOR_B, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftC = new CANSparkMax(can_LEFT_DRIVE_MOTOR_C, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftDrive = new SpeedControllerGroup(leftA, leftB, leftC);

        rightA = new CANSparkMax(can_RIGHT_DRIVE_MOTOR_A, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightB = new CANSparkMax(can_RIGHT_DRIVE_MOTOR_B, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightC = new CANSparkMax(can_RIGHT_DRIVE_MOTOR_C, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightDrive = new SpeedControllerGroup(rightA, rightB, rightC);

        drive = new DifferentialDrive(leftDrive, rightDrive);
    }

    public void drive(double throttle, double rotation, boolean isQuickTurn) {
        drive.curvatureDrive(throttle, rotation, isQuickTurn);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveCurvature());
    }
}
