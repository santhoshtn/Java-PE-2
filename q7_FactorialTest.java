package PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class q7_FactorialTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    factorial fact = new factorial();
    //for int
    @Test
    public void fact_successs(){
        int i = 7;
        String expectedValue = "5040";
        String actualValue = fact.fact_int(i);
    }
    @Test
    public void fact_failure(){
        int i = -7;
        String expectedValue = "negative number";
        String actualValue = fact.fact_int(i);
    }

    //for long
    @Test
    public void facts_success(){
        long i = 20;
        String expectedValue = "2432902008176640000";
        String actualValue = fact.fact_long(i);
    }
    @Test
    public void facts_failure(){
        int i = -7;
        String expectedValue = "negative number";
        String actualValue = fact.fact_long(i);
    }

}