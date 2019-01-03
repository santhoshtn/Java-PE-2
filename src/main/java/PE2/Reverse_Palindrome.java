package PE2;

public class Reverse_Palindrome {
    public static String Reverse_String(String s){
        String reverse="";
        for(int i=s.length() -1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        return reverse;
    }
    public static String Palindrome(String s){
        String reverse="",return_value="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        if(s.equals(reverse))
        {
            return_value+=s+" is a Palindrome";
        }
        else{
            return_value+=s+" is not a Palindrome";
        }
    return return_value;
    }
}
