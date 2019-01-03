package PE2;

import java.util.Arrays;

public class StudentGrade {
    public static String average(int[] array){
        int sum=0,i;
        for(i=0;i<array.length;i++)
            sum=sum+array[i];
        return String.valueOf(sum/i);
    }
    public static long minimum(int[] array){
        Arrays.sort(array);
        return array[0];
    }
    public static long maximum(int[] array){
        Arrays.sort(array);
        return array[array.length-1];

    }
}
