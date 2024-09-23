package JAVA_CODE.Strings;
import java.util.*;
@SuppressWarnings("unused")

public class Basic_string {
    public static void printLetters(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     //   char arr[]={'a','b','c','d'};
        //define
        //String str = "abcd";
        //String str2 =new String("xyz@#$$");

        //Strings are IMMUTABLE

      /*  //Taking Input in String
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String here: ");
        String name=sc.nextLine();
        System.out.println(name);   */

        // String fullName="Tony Stark";
        // System.out.println(fullName.length());

     /*   //Concatenation
        String firstName="Prince";
        String lastName="Yadav";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);   */

    /*    //Char At  -return character at given index
        String s= "Prince kumar Yadav";
        System.out.println(s.charAt(8));
        printLetters(s);      */

    /*    //equals Operator
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equals");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equals");
        }
        //here s1 not equal to s3 due to which we use .equals operator
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equals");
        }     */

     /*   // Substring
        String s="HelloWorld";
        System.out.println(s.substring(0,5));
         */
        
        //find largest using lexicographically
        String fruits[]={"apple","mango","banana"};
        String largest =fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
