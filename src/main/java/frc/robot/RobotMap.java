package frc.robot;

public class RobotMap {
    // Drive Train
    public static final int can_LEFT_DRIVE_MOTOR_A = 11;
    public static final boolean inv_LEFT_DRIVE_MOTOR_A = false;
    public static final boolean sinv_LEFT_DRIVE_MOTOR_A = false;

    public static final int can_LEFT_DRIVE_MOTOR_B = 6;
    public static final boolean inv_LEFT_DRIVE_MOTOR_B = false;
    public static final boolean sinv_LEFT_DRIVE_MOTOR_B = false;

    public static final int can_LEFT_DRIVE_MOTOR_C = 8;
    public static final boolean inv_LEFT_DRIVE_MOTOR_C = false;
    public static final boolean sinv_LEFT_DRIVE_MOTOR_C = false;

    public static final int can_RIGHT_DRIVE_MOTOR_A = 9;
    public static final boolean inv_RIGHT_DRIVE_MOTOR_A = true;
    public static final boolean sinv_RIGHT_DRIVE_MOTOR_A = true;

    public static final int can_RIGHT_DRIVE_MOTOR_B = 10;
    public static final boolean inv_RIGHT_DRIVE_MOTOR_B = true;
    public static final boolean sinv_RIGHT_DRIVE_MOTOR_B = true;

    public static final int can_RIGHT_DRIVE_MOTOR_C = 12;
    public static final boolean inv_RIGHT_DRIVE_MOTOR_C = true;
    public static final boolean sinv_RIGHT_DRIVE_MOTOR_C = true;


    // Shooter
    public static final int pcm_LEFT_SHOOTER_FORWARD = 6;
    public static final int pcm_LEFT_SHOOTER_REVERSE = 1;
    public static final int pcm_RIGHT_SHOOTER_FORWARD = 7;
    public static final int pcm_RIGHT_SHOOTER_REVERSE = 0;

    // Arm
    public static final int can_ARM_LIFT_MOTOR_A = 3;
    public static final boolean inv_ARM_LIFT_MOTOR_A = false;
    public static final boolean sinv_ARM_LIFT_MOTOR_A = false;
    public static final int can_ARM_LIFT_MOTOR_B = 5;
    public static final boolean inv_ARM_LIFT_MOTOR_B = false;
    public static final int pwm_ARM_INTAKE_MOTOR = 9;
    public static final boolean inv_ARM_INTAKE_MOTOR = true;

    // Climber
    public static final int pcm_FRONT_CLIMB_A = 5;
    public static final int pcm_FRONT_CLIMB_B = 2;
    public static final int can_CLIMB_MOTOR = 4;
    public static final boolean inv_CLIMB_MOTOR = false;
    public static final int pcm_CLIMBER_FORWARD = 3;
    public static final int pcm_CLIMBER_REVERSE = 4;
    // Miscellaneous
    public static final int can_PCM_1 = 1;
    public static final int can_PCM_2 = 2;
    public static final int can_IMU = 7;
    public static final int analog_LEFT_DISTANCE = 3;
    public static final int analog_RIGHT_DISTANCE = 2;
    public static final int can_COMPRESSOR_PORT = 2;
    //Ball Holder
    public static final int pcm_LEFT_DAMP_FORWARD = 0;
    public static final int pcm_LEFT_DAMP_REVERSE = 7;
    public static final int pcm_RIGHT_DAMP_FORWARD = 1;
    public static final int pcm_RIGHT_DAMP_REVERSE = 6;
}
