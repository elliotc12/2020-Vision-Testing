import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import static frc.robot.RobotMap;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {

    CANSparkMax leftA, leftB, leftC;
    SpeedControllerGroup leftDrive;
    CANSparkMax rightA, rightB, rightC;
    SpeedControllerGroup rightDrive;
    DifferentialDrive drive;

    public DriveTrain() {
	leftA = new CANSparkMax(RobotMap.can_LEFT_DRIVE_MOTOR_A, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftB = new CANSparkMax(RobotMap.can_LEFT_DRIVE_MOTOR_B, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftC = new CANSparkMax(RobotMap.can_LEFT_DRIVE_MOTOR_C, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftDrive = new SpeedControllerGroup(leftA, leftB, leftC);

        rightA = new CANSparkMax(RobotMap.can_RIGHT_DRIVE_MOTOR_A, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightB = new CANSparkMax(RobotMap.can_RIGHT_DRIVE_MOTOR_B, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightC = new CANSparkMax(RobotMap.can_RIGHT_DRIVE_MOTOR_C, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightDrive = new SpeedControllerGroup(rightA, rightB, rightC);

	drive = new DifferentialDrive(leftDrive, rightDrive);
    }

    public void drive(double forward, double rotation) {
	drive.curvatureDrive(forward, rotation, true);
    }

    @Override
    public void initDefaultCommand() {
	setDefaultCommand(new JoystickDrive());
    }

    @Override
    public void periodic() {
	// Eventually post to networktables here
    }
}
