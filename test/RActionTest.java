import com.marsrovers.model.Plateau;
import com.marsrovers.model.Rover;
import junit.framework.TestCase;

public class RActionTest extends TestCase{

    private Plateau plateau = new Plateau(5,5);
    Rover rover = new Rover(0,0,'N',plateau);
    public void testTurnRight(){
        rover.move('R');
        assertEquals('E',rover.getOrientation());
        rover.move('R');
        assertEquals('S',rover.getOrientation());
        rover.move('R');
        assertEquals('W',rover.getOrientation());
        rover.move('R');
        assertEquals('N',rover.getOrientation());
    }
}
