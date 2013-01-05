package com.marsrovers.exception;

public class OutOfPlateauException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage(){
        return "The rover will go out of the plateau.";
    }
}
