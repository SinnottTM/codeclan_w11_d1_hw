import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(4, calculator.addition(2,2));
    }

    @Test
    public void canSub(){
        assertEquals(0, calculator.subtraction(2,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(4, calculator.multiplication(2,2));
    }

    @Test
    public void canDivide(){
        assertEquals(5.0, calculator.division(10,2));
    }
}
