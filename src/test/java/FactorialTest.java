import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test


public void testFactorialZero(){

    assertEquals(1, Factorial.factorial(0), "Factorial of 0 should be 1");

}

    @Test

    public void testFactorialPositive() {

        assertEquals(120, Factorial.factorial(5), "Factorial of 5 is 120" );
        assertEquals(720, Factorial.factorial(6),  "Factroial of 6 is 720");

    }
    @Test

    public void testFactorialNegative(){

        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-5);
        }, "Factorial of negative should not argue");



    }

    }