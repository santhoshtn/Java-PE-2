package PE2;

public class Power4 {
    public static String power_4(int input){
        if(input == 0) {
            return "Number is not power of 4";
        }
        while(input != 1)
        {
            if(input % 4 != 0)
                return "Number is not power of 4";
            input = input / 4;
        }
        return "Number is power of 4";
    }
}
