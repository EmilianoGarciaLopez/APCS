import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("YOUR_MOM"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("MCMLXIV"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("XIXIXIXI"), -1);
    }
}