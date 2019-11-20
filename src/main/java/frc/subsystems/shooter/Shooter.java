package frc.subsystems.shooter;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Shooter extends Subsystem {

    private DoubleSolenoid shootLeft = new DoubleSolenoid(RobotMap.can_PCM_2, RobotMap.pcm_LEFT_SHOOTER_FORWARD,
            RobotMap.pcm_LEFT_SHOOTER_REVERSE);
    private DoubleSolenoid shootRight = new DoubleSolenoid(RobotMap.can_PCM_2, RobotMap.pcm_RIGHT_SHOOTER_FORWARD,
            RobotMap.pcm_RIGHT_SHOOTER_REVERSE);


    @Override
    protected void initDefaultCommand() {
    }

    public void extendShootLeft() {
        shootLeft.set(DoubleSolenoid.Value.kForward);
    }

    public void retractShootLeft() {
        shootLeft.set(DoubleSolenoid.Value.kReverse);
    }

    public void extendShootRight() {
        shootRight.set(DoubleSolenoid.Value.kForward);
    }

    public void retractShootRight() {
        shootRight.set(DoubleSolenoid.Value.kReverse);
    }

}
