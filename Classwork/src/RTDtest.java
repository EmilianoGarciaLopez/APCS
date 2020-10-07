import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RTDtest {
    RomanToDecimal ob = new RomanToDecimal();

    @Test
    public void RTDest() {
        //10 valid
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("XVII"), 17);
        assertEquals(RomanToDecimal.romanToDecimal("XVIII"), 18);
        assertEquals(RomanToDecimal.romanToDecimal("LX"), 60);
        assertEquals(RomanToDecimal.romanToDecimal("LXX"), 70);
        assertEquals(RomanToDecimal.romanToDecimal("LXXX"), 80);
        assertEquals(RomanToDecimal.romanToDecimal("XC"), 90);
        assertEquals(RomanToDecimal.romanToDecimal("CL"), 150);
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("XI"), 11);

        //4 invalid
        assertEquals(RomanToDecimal.romanToDecimal("YOURMOM"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("YOUR_MOM"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("lowercase"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("camelCase"), -1);

        //4 non-logical
        assertEquals(RomanToDecimal.romanToDecimal("ICI"), 100);
        assertEquals(RomanToDecimal.romanToDecimal("IIC"), 100); //1 + 99
        assertEquals(RomanToDecimal.romanToDecimal("IM"), 999);
        assertEquals(RomanToDecimal.romanToDecimal("XM"), 990);

        //2 NotEquals
        assertNotEquals(RomanToDecimal.romanToDecimal("YOUR_MOM"), 8);
        assertNotEquals(RomanToDecimal.romanToDecimal("xi"), 11);

    }
}