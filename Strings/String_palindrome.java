package JAVA_CODE.Strings;

public class String_palindrome {
    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<(n/2);i++){
            if(str.charAt(i) != str.charAt(n-1-i) ){
                //noat a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(palindrome(str));
    }
    
}
