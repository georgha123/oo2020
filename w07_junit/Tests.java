import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void squareTest(){
        Square square = new Square(5);
        assertEquals(20, square.getCircumference(5,0), 0.1);
        assertEquals(25, square.getArea(5,0), 0.1);
    }
    @Test
    public void rectangleTests(){
        Rectangle rectangle = new Rectangle(4,5);
        assertEquals(18, rectangle.getCircumference(4,5), 0.1);
        assertEquals(20, rectangle.getArea(4,5), 0.1);

    }
}
