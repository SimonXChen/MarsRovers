import com.marsrovers.model.Plateau;
import com.marsrovers.model.Rover;
import junit.framework.TestCase;

public class MActionTest extends TestCase{

    private Plateau plateau = new Plateau(5,5);
    public void testMoveTowardsN(){
        Rover rover = new Rover(1,1,'N',plateau);
        rover.move('M');
        assertEquals(2,rover.getY());
    }
    public void testMoveTowardsE(){
        Rover rover = new Rover(1,1,'E',plateau);
        rover.move('M');
        assertEquals(2,rover.getX());
    }
    public void testMoveTowardsS(){
        Rover rover = new Rover(1,1,'S',plateau);
        rover.move('M');
        assertEquals(0,rover.getY());
    }
    public void testMoveTowardsW(){
        Rover rover = new Rover(1,1,'W',plateau);
        rover.move('M');
        assertEquals(0,rover.getX());
    }
}
