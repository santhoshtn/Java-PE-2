package PE2;

public class factorial {
    public static String fact_int(long input){
        long fact=1;
        if(input<0){
            return "negative number";
        }
        for(long i=1;i<=input;i++)
        {
            fact=fact*i;
        }
        return String.valueOf(fact);
    }
}
