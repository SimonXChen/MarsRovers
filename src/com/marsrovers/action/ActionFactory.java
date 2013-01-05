package com.marsrovers.action;

import java.lang.reflect.Constructor;

import com.marsrovers.model.Rover;

public class ActionFactory{
	
    public static AbstractAction getAction(Rover rover,char command){
    	AbstractAction action = null;
        try {
            Class<?> actionClass = Class.forName("com.marsrovers.action." + command + "Action");
            Constructor constructor = actionClass.getConstructor(Rover.class);
            action = (AbstractAction)constructor.newInstance(rover);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            throw new RuntimeException("DirectorFactory inner error.");
        }

        return action;
    }
}