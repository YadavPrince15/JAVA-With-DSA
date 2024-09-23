package JAVA_CODE.Strings;

public class stringcompression {
    public static String compress(String str){
        String newStr="";

        for(int i=0;i<str.length();i++){   //O(n)
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >= 0){
                newStr += count.toString();
            }
        }
        return newStr;

    }
    public static void main(String[] args) {
        String str = "aaaabbbbc";
        System.out.println(compress(str));
    }
}
