/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Spruce
 */
public class Shooter extends Subsystem {
    Jaguar frontWheel;
    Jaguar backWheel;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Shooter(){
        frontWheel = new Jaguar(3);
        backWheel = new Jaguar(4);
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void disable(){
        frontWheel.set(0);
        backWheel.set(0);
    }
    
    public void shoot(double frontWheelSpeed, double backWheelSpeed){
        frontWheel.set(frontWheelSpeed);
        backWheel.set(backWheelSpeed);
    }
}
