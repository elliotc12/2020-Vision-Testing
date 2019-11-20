package frc.subsystems.drivetrain;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import static frc.robot.RobotMap.*;

public class Drivetrain extends Subsystem {
    CANSparkMax leftA, leftB, leftC;
    SpeedControllerGroup leftDrive;
    CANSparkMax rightA, rightB, rightC;
    SpeedControllerGroup rightDrive;

    DifferentialDrive drive;

    NetworkTableEntry leftAPos, leftBPos, leftCPos;
    NetworkTableEntry rightAPos, rightBPos, rightCPos;

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

        NetworkTable table = NetworkTableInstance.getDefault().getTable("datatable");

        leftAPos = table.getEntry("leftA");
        leftBPos = table.getEntry("leftB");
        leftCPos = table.getEntry("leftC");
        rightAPos = table.getEntry("rightA");
        rightBPos = table.getEntry("rightB");
        rightCPos = table.getEntry("right`C");
    }

    public void drive(double throttle, double rotation, boolean isQuickTurn) {
        drive.curvatureDrive(throttle, rotation, isQuickTurn);
    }

    @Override
    protected void initDefaultCommand() {
//        setDefaultCommand(new DriveCurvature());
    }

    @Override
    public void periodic() {
        //leftA: yes
        //leftB: no
        //leftC: no
        //rightA: yes
        //rightB: no
        //rightC: no

        rightB.set(0.5);
        leftAPos.setDouble(leftA.getEncoder().getPosition());
        leftBPos.setDouble(leftB.getEncoder().getPosition());
        leftCPos.setDouble(leftC.getEncoder().getPosition());
        rightAPos.setDouble(rightA.getEncoder().getPosition());
        rightBPos.setDouble(rightB.getEncoder().getPosition());
        rightCPos.setDouble(rightC.getEncoder().getPosition());
    }
}
