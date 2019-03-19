import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calc.add(2,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calc.subtract(6,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(16, calc.multiply(4,4));
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, calc.divide(5.0,2.0), 0.02);
    }

}
