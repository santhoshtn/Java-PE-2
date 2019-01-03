package PE2;
import org.junit.*;
import static org.junit.Assert.*;

public class Power4Test {


    Power4 test = new Power4();

    @Test
    public void power_4_success(){
        int i = 16;
        int j = 256;
        String expectedValue1 = "Number is power of 4";
        String expectedValue2 = "Number is power of 4";
        String actualValue1 = test.power_4(i);
        String actualValue2 = test.power_4(j);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,actualValue2);
    }
    @Test
    public void power_4_failure(){
        int i = 518;
        int j = 525;
        String expectedValue1 = "Number is not power of 4";
        String expectedValue2 = "Number is not power of 4";
        String actualValue1 = test.power_4(i);
        String actualValue2 = test.power_4(j);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,actualValue2);
    }
    @Test
    public void ZeroCheck(){
        int i = 0;
        String expectedValue = "Number is not power of 4";
        String actualValue = test.power_4(i);
        assertEquals(expectedValue,actualValue);
    }

}