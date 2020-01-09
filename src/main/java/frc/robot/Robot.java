package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {

    /**
     * Initialize all systems here as public & static.
     * Ex: public static System system = new System();
     */

    public static DriveTrainSubsystem drivetrain_subsystem = new DriveTrainSubsystem()

    public static OI oi = new OI();

    @Override
    public void robotInit() {

    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }


    @Override
    public void autonomousInit() {
        //Example of setting auto: Scheduler.getInstance().add(YOUR AUTO);
    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopPeriodic() {
	
    }

    @Override
    public void testInit() {
	
    }

    @Override
    public void testPeriodic() {

    }
}
