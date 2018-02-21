package org.metrobots.commands.teleop;

import org.metrobots.Robot;
import org.metrobots.subsystems.CubeController;

import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopIntake extends Command {
	private static final double MOTOR_SPEED = 0;
	private boolean isOn = false;
	/**
	 * Spin wheels inward. <p>
	 */
    public StopIntake() {
    	requires(Robot.mCubeController);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.mCubeController.intake(MOTOR_SPEED);
    }
    //  
    //protected void execute() {
//    	if (gamepad1.getBumperPressed(Hand.kRight)) {
////    		if (isOn = false) {
//    			motorSpeed = -1;
////    			isOn = true;
////    		} else {
////        		motorSpeed = 0;	
////        		isOn = false;
//    		}    
//    	 mCubeController.intake(motorSpeed);
//    }
// 
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
