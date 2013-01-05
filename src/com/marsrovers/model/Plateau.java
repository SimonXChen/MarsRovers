package com.marsrovers.model;

public class Plateau {
	
	public static final char[] DIRECTIONS = {'N','E','S','W'};

    private final int rightX;
    private final int upperY;

    public Plateau(int rightX,int upperY){
        this.rightX = rightX;
        this.upperY = upperY;
    }

    public int getRightX() {
        return rightX;
    }

    public int getUpperY() {
        return upperY;
    }

}
