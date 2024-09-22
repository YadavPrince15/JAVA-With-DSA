//Type promotion expression in java
public class JavaBasics8 {
    public static void main(String[] args) {
     /*   char a= 'a';
        char b= 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);     //Result shows in integer  */

     /*  short a=25;
        byte b=5;
        char c= 'c';
        byte bt =(byte)(a+b+c);
        System.out.println(bt);          */ 

        int a=10;
        float b =20.25f;
        long c=25;
        double d=30;
        double ans = a+b+c+d;
        // since the biggest data type are double so ans is in double
        System.out.println(ans);
    }
}
