import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.khanyi.Calculator.calculator;

public class CalculatorTest {
    int result ;

    @Test
    @DisplayName("Adiition test")
    public void testAdd() {
        float result;

        assertEquals(12 ,calculator("6 + 6"), 1);
    }
    @Test
    @DisplayName("Adiition test")
    public void testSub() {
        float result;

        assertEquals(0 ,calculator("6 - 6"), 1);
    }
    @Test
    @DisplayName("Adiition test")
    public void testProduct() {
        float result;

        assertEquals(12 ,calculator("4 * 3"), 1);
    }
    @Test
    @DisplayName("Adiition test")
    public void testDiv() {
        float result;

        assertEquals(12 ,calculator("72 / 6"), 1);
    }




}
