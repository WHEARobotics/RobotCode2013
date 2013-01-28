/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.TankDrive;

/**
 *
 * @author Spruce
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TankDrive());
        
    }
    public Chassis(){
        drive = new RobotDrive(2,3);
        drive.setSafetyEnabled(false);
        //Initializes some parts of the chasis. 
    }
    public void tankDrive(double stickOne, double stickTwo){
        drive.tankDrive(stickOne, stickTwo);
        //Creates a method of chassis that works as a tank drive
    }
}
