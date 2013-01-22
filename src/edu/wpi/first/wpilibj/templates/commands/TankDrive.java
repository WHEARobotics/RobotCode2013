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
public class TankDrive extends CommandBase {
       
       
         
        
        double speedModifier = 0.75;
        //Pre-Defines various objects recived from the OI class
    
    public TankDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(chassis);
     
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
            if (oi.getButton(1,3).get()){
                speedModifier = 0.6;
            }
            else if(oi.getButton(2,3).get()){
                speedModifier = 1;
            }
            else if(oi.getButton(1,2).get()&&oi.getButton(2, 2).get()){
                speedModifier = 0.75;
            }
           chassis.tankDrive((oi.getJoystick(1).getAxis(Joystick.AxisType.kY)*speedModifier), (oi.getJoystick(2).getAxis(Joystick.AxisType.kY)*speedModifier));
         //While no triggers are pressed the robot moves at .75 the joystick input
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
