/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 * @author Spruce
 */
public class Shoot extends CommandBase {
    JoystickButton triggerOne = oi.getTriggerOne();
    JoystickButton triggerTwo = oi.getTriggerTwo();
    public Shoot() {
        requires(shooter);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        shooter.disable();
        if (triggerOne.get()&&triggerTwo.get()){
            shooter.shoot(0.5, 0.5);
        }
        else{
            shooter.disable();
        }
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
