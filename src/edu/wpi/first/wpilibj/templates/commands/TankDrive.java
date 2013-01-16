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
    Joystick stickOne =  oi.getJoystick(1);
        Joystick stickTwo = oi.getJoystick(2);
        JoystickButton triggerOne = oi.getTriggerOne();
        JoystickButton triggerTwo = oi.getTriggerTwo();
        
    
    public TankDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(chassis);
     
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
         while(triggerOne.get()) {
           chassis.tankDrive((stickOne.getAxis(Joystick.AxisType.kY)/2), (stickTwo.getAxis(Joystick.AxisType.kY)/2));
         }
         while(triggerTwo.get()){
             chassis.tankDrive(stickOne.getAxis(Joystick.AxisType.kY), stickTwo.getAxis(Joystick.AxisType.kY));
         }
         
           chassis.tankDrive((stickOne.getAxis(Joystick.AxisType.kY)*.75), (stickTwo.getAxis(Joystick.AxisType.kY)*.75));
         
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
