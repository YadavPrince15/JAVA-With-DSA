
//import java.util.*;
public class Function_method {
    public static void printHelloWorld(){
        System.out.println("Hello world");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int n1,int n2 ){  //parameters or formal parameters
        int sum=n1+n2;
        return sum;
    }

    public static void swap(int a,int b){
        //swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    } 
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;  //factorial of n
    }
    public static int binCoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binCoeff=fact_n/(fact_r * fact_nmr);
        return binCoeff;
    }

    // //func to calculate sum of 2 num
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    //func to cal sum of 3 no
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    //func to cal int sum
    public static int sum(int a,int b){
        return a+b;
     }
    //func to cal float sum
    public static float sum(float a,float b){
         return a+b;
    }

    // //only for n>=2
    // public static boolean isPrime(int n){
    //     //corner cases 2
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){

            int lastDigit=binNum%10;
            decNum=decNum +(lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNum= binNum/10;
        }
        System.out.println("decimal of  "+  myNum + "  ="+decNum);
    }

    public static void decToBin(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;
        while (n>0) {
            int rem=n%2;
            binNum=binNum+ (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+ myNum+"="+ binNum );

    }

    public static void main(String[] args) {
     //   printHelloWorld();      //Function method call
      /*   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int sum=calculateSum(p, q);    //arguments actual parameters
        System.out.println("Sum="+sum);     */

     /*    //swap- exchange value
        int a=5;
        int b=10;
        swap(a,b);   */


     /*   //Product of a and b
        int a=5;
        int b=4;
        int prod= multiply(a, b);
        System.out.println("a*b="+prod);     */


     /*    //finding factorial of n
        System.out.println(factorial(5));        */


    /*    //Binomial coefficient 
        System.out.println(binCoeff(5,2));
         */

    /*     //function overloading
        System.out.println(sum(3,6));
        System.out.println(sum(2,3,5));     */


    /*    //function overloading with data type
        System.out.println(sum(4,5));
        System.out.println(sum(2.5f,5.4f));     */

    /*    //check whether prime or not
        System.out.println(isPrime(16));    */

    /*    // Print Prime in Ranges
        primeInRange(100);   //2to 100        */

     /*   //Binary to decimal conversion
        binToDec(101);     */

        //Decimal to Binary
        decToBin(7);
    }
}
