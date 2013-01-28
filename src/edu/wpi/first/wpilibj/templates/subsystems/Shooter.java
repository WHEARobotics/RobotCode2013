/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.Shoot;

/**
 *
 * @author Spruce
 */
public class Shooter extends Subsystem {
    Jaguar Wheel;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Shooter(){
     Wheel = new Jaguar(3);
      
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Shoot());
    }
    
    public void disable(){
       Wheel.set(0);
        
    }
    
    public void shoot(double WheelSpeed){
     Wheel.set(WheelSpeed);
        
    }
}
