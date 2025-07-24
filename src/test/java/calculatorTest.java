import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.khanyi.Main;

import static org.junit.Assert.assertEquals;

public class calculatorTest {
    int result ;

    @Test
    @DisplayName("Adiition test")
    public void testAdd() {
        assertEquals(12 , result);
    }


}
