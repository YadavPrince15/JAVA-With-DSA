package JAVA_CODE.Strings;

public class string_builder {

    public static String toUpperCase(String str){
        StringBuilder sb =new StringBuilder("");

        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
     /*   StringBuilder sb= new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);   
        } //abcdefghi...z
        
        System.out.println(sb);
        System.out.println(sb.length());     */


        //Convert each of first letter of a word into upper case
        String str="hi,i am prince";
        System.out.println(toUpperCase(str));
    }
    
}
