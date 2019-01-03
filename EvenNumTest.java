package PE2;
import org.junit.*;
import static org.junit.Assert.*;

public class EvenNumTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    IsEven test = new IsEven();

    @Test
    public void IsEven_success() {
        int i = 4;
        int j = 1296;
        String expectedValue1 = "Number is even number";
        String expectedValue2 = "Number is even number";
        String actualValue1 = test.EvenNum(i);
        String actualValue2 = test.EvenNum(j);
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }
    @Test
    public void IsEven_Failure() {
        int i = 517;
        int j = 525;
        String expectedValue1 = "Number is not a even number";
        String expectedValue2 = "Number is not a even number";
        String actualValue1 = test.EvenNum(i);
        String actualValue2 = test.EvenNum(j);
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }
}