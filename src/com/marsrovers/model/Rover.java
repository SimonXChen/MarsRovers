package com.marsrovers.model;

import com.marsrovers.action.AbstractAction;
import com.marsrovers.action.ActionFactory;

public class Rover {
	private int x;
    private int y;
    private char orientation;
    private Plateau plateau;

    public Rover(int x,int y,char orientation,Plateau plateau){
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.plateau = plateau;
    }

   

	public void  move(char command){
    	AbstractAction action = ActionFactory.getAction(this,command);
    	action.action();
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}
	
    @Override
    public String toString(){
        return x + " " + y + " " + orientation;
    }
    
}
