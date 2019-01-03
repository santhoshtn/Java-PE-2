package PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
        factorial fact = new factorial();
    }

    @After
    public void tearDown() throws Exception {
        fact=null;
    }

    factorial fact = new factorial();

    @Test
    public void fact_successs(){
        long i = 7;
        String expectedValue = "5040";
        String actualValue = fact.fact_int(i);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void fact_failure(){
        long i = -7;
        String expectedValue = "negative number";
        String actualValue = fact.fact_int(i);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void facts_success(){
        long i = 20;
        String expectedValue = "2432902008176640000";
        String actualValue = fact.fact_int(i);
        assertEquals(expectedValue,actualValue);
    }

}