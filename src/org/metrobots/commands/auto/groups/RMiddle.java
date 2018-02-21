package org.metrobots.commands.auto.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.metrobots.commands.auto.DriveForward;
import org.metrobots.commands.auto.GyroReset;
import org.metrobots.commands.auto.Rotate;

/**
 *
 */
public class RMiddle extends CommandGroup {
//ALL NUMBERS ARE ARBITRARY DO NOT RUN
    public RMiddle() {
    	this.addSequential(new DriveForward(5));
    	this.addSequential(new GyroReset());
    	this.addSequential(new Rotate(90));
    	this.addSequential(new GyroReset());
    	this.addSequential(new DriveForward(5));
    	this.addSequential(new GyroReset());
    	this.addSequential(new Rotate(-90));
    	this.addSequential(new GyroReset());
    	this.addSequential(new DriveForward(5));
    	//addSequential(new arm);
    }

}
