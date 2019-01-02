package PE2;

import org.junit.Test;

import static org.junit.Assert.*;

public class q6_StudentGradeTest {
    q6_StudentGrade obj=new q6_StudentGrade();
    @Test
    public void AverageSuccess(){
        int marks_array[]={10,20,30,40};
        long expectedValue=25;
        long actualValue=obj.average(marks_array);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void AverageFailure(){
        int marks_array[]={10,20,30,40};
        long expectedValue=30;
        long actualValue=obj.average(marks_array);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void MinimumSuccess(){
        int marks_array[]={10,20,30,40};
        long expectedValue=10;
        long actualValue=obj.average(marks_array);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void MinimumFailure(){
        int marks_array[]={10,20,30,40};
        long expectedValue=20;
        long actualValue=obj.average(marks_array);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void MaximumSuccess(){
        int marks_array[]={10,20,30,40};
        long expectedValue=40;
        long actualValue=obj.average(marks_array);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void MaximumFailure(){
        int marks_array[]={10,20,30,40};
        long expectedValue=10;
        long actualValue=obj.average(marks_array);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void GradeInputCheck(){
        //check whether each grade entered is between 0 and 100
        long grade_input=120;
        String expectedValue="Grade out of range";
        String actualValue=obj.GradeInput(grade_input);
        assertEquals(expectedValue,actualValue);
    }
}