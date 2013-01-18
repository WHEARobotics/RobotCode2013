
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    private Joystick stickOne, stickTwo;
    private JoystickButton triggerOne, triggerTwo;
    //Makes (private) some blank objects
    public OI(){
        stickOne = new Joystick(1);
        stickTwo = new Joystick(2);
        triggerOne = new JoystickButton(stickOne, Joystick.ButtonType.kTop.value);
        triggerTwo = new JoystickButton(stickTwo, Joystick.ButtonType.kTop.value);
    
        //And gives them all values
    }
    public Joystick getJoystick(int num){
        Joystick joystickDefault = null;
        if (num==1){
            joystickDefault=stickOne;        
        }
        else if (num==2){
            joystickDefault=stickTwo;        
        }
        return joystickDefault;
        //If this method is called with input 1 it returns the first joystick, and if 2 is inputed then it returns the second joystick
    }
    public JoystickButton getTriggerOne(){
        return triggerOne;
    }
    public JoystickButton getTriggerTwo(){
        return triggerTwo;
    }
    //These should be obvious 
}

