//import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
     /*   // Print Hello world 100 times
        int counter=0;
        while(counter <100){
            System.out.println("Hello World");
            counter++;
        }       */


    /*    //Print numbers from 1 to 10
        int i=1;
        while(i<=10){
            System.out.print(i);
            System.out.print("\t");
            i++;
        }        */


    /*    //Print number from 1 to n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int range=sc.nextInt();
        int counter=1;
        while( counter <= range){
            System.out.print(counter+" ");
            counter++;
        }       */


     /*   //Print sum of first n natural number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of n natural:"+sum);
            */
        

        
    /*    //For loop example
        for(int i=1;i<=10;i++){
            System.out.println("Hello World");
        }     */


    /*   //Print square pattern
        for(int line=1;line<=4;line++){
            System.out.println("****");
        }         */


    /*    //Print reverse of a number n=10899
        int n=10899;
        while(n>0){
            int lastDigit=n%10;    //for finding last digit
            System.out.print(lastDigit);
            n=n/10;       //for removing last digit
        }         */


     /*    //Reverse the given number
        int n=76542;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
        */


    /*    //do-while Loop
        int i=1;
        do{
            System.out.println("Hello World");
            i++;
        }while(i<=10);
         */

        
    /*    //break statement example
        for(int i=1;i<=20;i++){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of loop");
         */

        
    /*    //Keep entering numbers till user enters a multiple of 10  by using break statement
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter ypur number:");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
         */


    /*   //continue statement  example
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;    //It skip 3 due to continue Keyword
            }
            System.out.print(i+" ");   
        }     */


    /*    //display all number entered by user except multiples of 10  by continue Keyword
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("Your number "+n);
        }while(true);
         */


    /*    //Check if a number is prime or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        
        if(n==2){
            System.out.println("n is prime");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<n-1;i++){
                if(n % i==0){  //n is multple of i)i not equal to 1 or n)
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is a Prime");
            }
            else{
                System.out.println("n is not a Prime");
            }
        }    */

    }
}
