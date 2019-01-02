package PE2;
import org.junit.*;
import static org.junit.Assert.*;

public class q2_Power4Test {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    power_4 test = new power_4();

    @Test
    public void power_4_success(){
        int i = 1296;
        int j = 625;
        String expectedValue1 = "Number is power of 4";
        String expectedValue2 = "Number is power of 4";
        String actualValue1 = test.power_4(i);
        String actualValue2 = test.power_4(j);
        assertEquals(expectedValue1,actualValue1);
        assertEquals(expectedValue2,actualValue2);
    }
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

}