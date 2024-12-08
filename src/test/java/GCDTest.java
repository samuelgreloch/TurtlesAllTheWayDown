import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class GCDTest {


    @Test

    public void testGCDLarge(){

        assertEquals(1098765,GCD.gcd(1098765432, 1098765),"GCD of 10987654321 and 1098765 is 1098765");
    }


    @Test

    public void testGCDSameNumbers(){

        assertEquals(5,GCD.gcd(5,5), "GCD of 5 and 5 is 5");
    }

    @Test

    public void testGCDNegative

}