//import java.util.*;
public class conditionalstatement {
    public static void main(String[] args) {
     /* // If-else statement
        int age=56;
        if(age>=18){
            System.out.println(" adult: vote , drive");
        }
        if (age >13 && age <18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }    */ 


      /*  //Print largest of two number
        int A=15, B=10;
        if(A>=B){
            System.out.println("A is largest than B");
        }
        else{
            System.out.println("A is smaller than B");
        } */


      /*  //Print if a number is even or odd
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        // if number divisible by 2 then even.so rem=0
        if(a%2==0){     
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }   */


     /*   //else if statement
        int age=14;
        if(age>=18){
            System.out.println(" adult: vote , drive");
        }
        else if(age >13 && age <18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }     */


    /*    //Income tax calculator
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your income:");
       int income=sc.nextInt();
       int tax;
       if(income < 500000){
             tax=0;
       }
       else if(income >= 500000 && income < 1000000){
            tax=(int)(income*0.2);
       }
       else{
            tax=(int)(income*0.3);
       }
       System.out.println("Your tax is:"+tax);
       */


     /*    //Print the largest of three
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of A,B,C:");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A>=B  && A>=C){
            System.out.println(A +" is largest");
        }
        else if(B>=C){
            System.out.println(B +" is largest");
        }
        else{
            System.out.println(C +" is largest");
        }      */


     /*   //Ternary Operator
        int n=7;
        String type=(n%2==0)?"Even":"Odd";
        System.out.println(type);
         */


    /*    //Check if a student is pass or fail
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int mark=sc.nextInt();
        String result= (mark>=33)?"Pass":"Fail";
        System.out.println(result);
         */


    /*    //Switch case
        int num=2;
        switch(num){
            case 1: System.out.println("samosa");
                    break;
            case 2:System.out.println("burger");
                    break;
            case 3:System.out.println("paanipuri");
                   break;
            default:System.out.println("We wake up");
        }      */



    /*    // calculator using switch case
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operator to calculate:");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
            case '%':System.out.println(a%b);
                break;
            default:System.out.println("Beyond limit");
        }       */
    }
}