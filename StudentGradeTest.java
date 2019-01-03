package PE2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade obj=new StudentGrade();
    @Test
    public void AverageSuccess(){
        int marks_array[]={10,20,30,40};
        String expectedValue="25";
        String actualValue=obj.average(marks_array);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void AverageFailure(){
        int marks_array[]={10,20,30,40};
        String expectedValue="30";
        String actualValue=obj.average(marks_array);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void MinimumSuccess(){
        int marks_array[]={10,20,30,40};
        long expectedValue=10;
        long actualValue=obj.minimum(marks_array);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void MinimumFailure(){
        int marks_array[]={10,20,30,40};
        long expectedValue=20;
        long actualValue=obj.minimum(marks_array);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void MaximumSuccess(){
        int marks_array[]={10,20,30,40};
        long expectedValue=40;
        long actualValue=obj.maximum(marks_array);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void MaximumFailure(){
        int marks_array[]={10,20,30,40};
        long expectedValue=10;
        long actualValue=obj.maximum(marks_array);
        assertNotEquals(expectedValue,actualValue);
    }
}