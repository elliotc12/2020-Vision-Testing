package frc.subsystems.ball_holder;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class BallHolder extends Subsystem {

    private DoubleSolenoid holdLeftSide = new DoubleSolenoid(RobotMap.can_PCM_1, RobotMap.pcm_LEFT_DAMP_FORWARD,
            RobotMap.pcm_LEFT_DAMP_REVERSE);
    private DoubleSolenoid holdRightSide = new DoubleSolenoid(RobotMap.can_PCM_1, RobotMap.pcm_RIGHT_DAMP_FORWARD,
            RobotMap.pcm_RIGHT_DAMP_REVERSE);


    @Override
    protected void initDefaultCommand() {
//        setDefaultCommand(new HoldBall());
    }

    public void extendHoldLeft() {
        holdLeftSide.set(DoubleSolenoid.Value.kForward);
    }

    public void retractHoldLeft() {
        holdLeftSide.set(DoubleSolenoid.Value.kReverse);
    }

    public void extendHoldRight() {
        holdRightSide.set(DoubleSolenoid.Value.kForward);
    }

    public void retractHoldRight() {
        holdRightSide.set(DoubleSolenoid.Value.kReverse);
    }

}
