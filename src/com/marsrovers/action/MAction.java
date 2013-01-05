package com.marsrovers.action;

import com.marsrovers.exception.OutOfPlateauException;
import com.marsrovers.model.Rover;

public class MAction extends AbstractAction{

    public MAction(Rover rover) {
        super(rover);
    }

    @Override
    public void action() {
           switch(rover.getOrientation()){
               case 'N':
                    if(rover.getY() >= rover.getPlateau().getUpperY()){
                        throw new OutOfPlateauException();
                    }else{
                        rover.setY(rover.getY() + 1);
                    }
                   break;
               case 'E':
                   if(rover.getX() >= rover.getPlateau().getRightX()){
                       throw new OutOfPlateauException();
                   }else{
                       rover.setX(rover.getX() + 1);
                   }
                   break;
               case 'S':
                   if(rover.getY() <= 0){
                       throw new OutOfPlateauException();
                   }else{
                       rover.setY(rover.getY() - 1);
                   }
                   break;
               case 'W':
                   if(rover.getX() <= 0){
                       throw new OutOfPlateauException();
                   }else{
                       rover.setX(rover.getX() - 1);
                   }
                   break;
               default:
                   break;
           }
    }
}
