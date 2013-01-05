package com.marsrovers.action;

import com.marsrovers.model.Rover;

public abstract class AbstractAction{
    protected final Rover rover;
    
    public AbstractAction(Rover rover){
        this.rover = rover;
    }

    abstract public void action ();
}