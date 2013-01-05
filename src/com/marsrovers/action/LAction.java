package com.marsrovers.action;

import com.marsrovers.model.Plateau;
import com.marsrovers.model.Rover;

public class LAction extends AbstractAction{

    public LAction(Rover rover) {
        super(rover);
    }

    @Override
    public void action(){
        int index = 0;
        for(;index < Plateau.DIRECTIONS.length;index++){
            if(Plateau.DIRECTIONS[index] == rover.getOrientation()){
                index = (index - 1 + Plateau.DIRECTIONS.length) % Plateau.DIRECTIONS.length;
                break;
            }
        }

        rover.setOrientation(Plateau.DIRECTIONS[index]);
    }
}
