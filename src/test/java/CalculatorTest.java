
import org.junit.Test;


import static org.junit.Assert.assertEquals;

//import static org.khanyi.calculator.Calculator.calculator;

public class CalculatorTest {
    int result ;

    @Test

    public void testAdd() {
        float result;

        assertEquals(12 , Calculator.calculator("6 + 6"), 1);
    }
    @Test

    public void testSub() {
        float result;

        assertEquals(0 , Calculator.calculator("6 - 6"), 1);
    }
    @Test

    public void testProduct() {
        float result;

        assertEquals(12 , Calculator.calculator("4 * 3"), 1);
    }
    @Test

    public void testDiv() {
        float result;

        assertEquals(12 , Calculator.calculator("72 / 6"), 1);
    }




}
