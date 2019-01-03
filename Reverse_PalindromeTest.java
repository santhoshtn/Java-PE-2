package PE2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Reverse_PalindromeTest {
    Reverse_Palindrome object = new Reverse_Palindrome();
    @Test
    public void ReverseInputSuccess(){
        String value="123";
        String expectedValue="321";
        String actualValue=object.Reverse_String(value);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void ReverseInputFailure(){
        String value="123";
        String expectedValue="123";
        String actualValue=object.Reverse_String(value);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void PalindromeCheck(){
        String value="12321";
        String expectedValue="12321 is a Palindrome";
        String actualValue=object.Palindrome(value);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void NotAPalindromeCheck(){
        String value="12345";
        String expectedValue="12345 is not a Palindrome";
        String actualValue=object.Palindrome(value);
        assertEquals(expectedValue,actualValue);
    }
}