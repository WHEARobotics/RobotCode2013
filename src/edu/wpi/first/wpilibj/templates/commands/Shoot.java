/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 * @author Spruce
 */
public class Shoot extends CommandBase {
    
    public Shoot() {
        requires(shooter);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
        if (oi.getButton(1, 1).get()&&oi.getButton(2, 1).get()){
            shooter.shoot(1);
        }
        else if(oi.getButton(2, 1).get()){
            shooter.shoot(.5);
        }
        else if(oi.getButton(1, 1).get()){
            shooter.shoot(oi.getJoystick(1).getAxis(Joystick.AxisType.kZ));
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
