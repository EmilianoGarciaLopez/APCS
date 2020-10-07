//import statements
import org.junit.Test;
import static org.junit.Assert.assertEquals; //tests if expected and actual values are the same
import static org.junit.Assert.assertNotEquals; // tests if expected and actual are not the same

public class RTDtest {


    @Test
    public void RTDest() {
        //10 valid
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14); // 10 +(5-1)
        assertEquals(RomanToDecimal.romanToDecimal("XVII"), 17);//10+5+1+1
        assertEquals(RomanToDecimal.romanToDecimal("XVIII"), 18); //10+5+1+1+1
        assertEquals(RomanToDecimal.romanToDecimal("LX"), 60); //50+10
        assertEquals(RomanToDecimal.romanToDecimal("LXX"), 70); //50+10+10
        assertEquals(RomanToDecimal.romanToDecimal("LXXX"), 80); //50+10+10+10
        assertEquals(RomanToDecimal.romanToDecimal("XC"), 90); //100-10
        assertEquals(RomanToDecimal.romanToDecimal("CL"), 150); //100+50
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9); //10-1
        assertEquals(RomanToDecimal.romanToDecimal("XI"), 11); //10+1

        //4 invalid
        assertEquals(RomanToDecimal.romanToDecimal("YOURMOM"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("YOUR_MOM"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("lowercase"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("camelCase"), -1);

        //4 non-logical
        assertEquals(RomanToDecimal.romanToDecimal("ICI"), 100); //(100-1)+1
        assertEquals(RomanToDecimal.romanToDecimal("IIC"), 100); //1 + 99
        assertEquals(RomanToDecimal.romanToDecimal("IM"), 999); //1000-1
        assertEquals(RomanToDecimal.romanToDecimal("XM"), 990); //1000-10

        //2 NotEquals
        assertNotEquals(RomanToDecimal.romanToDecimal("YOUR_MOM"), 8); //this should return -1
        assertNotEquals(RomanToDecimal.romanToDecimal("xi"), 11); // this is lowercase, and should also return -1

    }
}