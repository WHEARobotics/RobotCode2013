/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Spruce
 */

public class Climber extends Subsystem {
    private Victor climbingArray[];
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Climber() {
    for(int i = 5; i<=11; i++){
        climbingArray[i-5]=new Victor(i);
        System.out.println(i);
        /* The first two motors (0 and 1) control the vertical movement of the 
         * arms and are at ports 5 and 6 respectively. Motors 2-5 controls the horizontal movement of one arm,
         * at ports 7,8,9, and 10. 0 controls the same arms as 2 and 3, and 1 controls the same arm as 4 and 5.
         */ 
}
}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setSpeed(int motorNumber, double speed){
        climbingArray[motorNumber-1].set(speed);
    }
    
}
