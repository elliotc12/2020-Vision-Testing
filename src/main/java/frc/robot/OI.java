package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {

    private XboxController driveController, manipController;

    public OI() {
        initControllers();
    }

    private void initControllers() {
        driveController = new XboxController(0);
        manipController = new XboxController(1);
    }

    public double getDriveControllerX() {
	return driveController.getX(GenericHID.Hand.kRight);
    }

    public double getDriveControllerY() {
	return -1 * driveController.getY(GenericHID.Hand.kLeft);
    }
}
