package org.metrobots.commands.teleop;

import edu.wpi.first.wpilibj.XboxController;

import org.metrobots.Robot;
import org.metrobots.subsystems.Climber;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class MiniMotor extends Command {
	XboxController gamepad = new XboxController(1);
	Climber mClimber = new Climber();
	public MiniMotor() {
	}
	
    public MiniMotor() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(mClimber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		double leftY = gamepad.getY(Hand.kLeft); // Get y value of left joystick
		Climber.miniMotor.climberArm(leftY);
    }

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
