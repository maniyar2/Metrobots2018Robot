package org.metrobots.commands.auto.groups;

import edu.wpi.first.wpilibj.command.CommandGroup;
import src.org.metrobots.commands.auto.DriveForward;
import src.org.metrobots.commands.auto.Rotate;

/**
 *
 */
public class RLright extends CommandGroup {
//ALL CODE IS ARBITRARY DO NOT RUN
    public RLright() {

    	addSequential(new DriveForward(0.5, 5));
    	addSequential(new Rotate(-90, 1));
    	//addSequential(new arm)
    	addSequential(new Rotate(90, 1));
    	addSequential(new DriveForward(.5, 5));
    	
    }

	private void addSequential(Rotate rotate) {
		// TODO Auto-generated method stub
		
	}

	private void addSequential(DriveForward driveForward) {
		// TODO Auto-generated method stub
		
	}
}
