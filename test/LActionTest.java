import com.marsrovers.model.Plateau;
import com.marsrovers.model.Rover;
import junit.framework.TestCase;

public class LActionTest extends TestCase{

    private Plateau plateau = new Plateau(5,5);
    Rover rover = new Rover(0,0,'N',plateau);
    public void testTurnLeft(){
        rover.move('L');
        assertEquals('W',rover.getOrientation());
        rover.move('L');
        assertEquals('S',rover.getOrientation());
        rover.move('L');
        assertEquals('E',rover.getOrientation());
        rover.move('L');
        assertEquals('N',rover.getOrientation());
    }
}
