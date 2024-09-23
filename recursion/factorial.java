package JAVA_CODE.recursion;

public class factorial {
    @SuppressWarnings("unused")
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    //sum of n natural number
    public static int naturalSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = naturalSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // calculate nth term in fibonacci
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //check Whether array is sorted or not
    public static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    //First occurence of element in array
    public static int firstOccurence(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    //Last occurence of element in array
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound= lastOccurence(arr, key, i+1);
        if(isFound == -1  && arr[i] == key){
            return i;
        }
        return isFound;
    }

    //Print power of x^n
    public static int power(int x,int n){
        if(n== 0){
            return 1;
        }
        // int xnm1=power(x*n-1);
        // int xn = x * xnm1;
        // return xn;

        return x* power(x, n-1);
    }

    //print poweer of x^n in optimized way
    public static int optimizedPower(int a, int n){ //O(logn)
        if(n == 0){
            return 1;
        }
        int halfPower =  optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        //int n = 5;
        // System.out.println(fact(n));

        // int n=6;
        // System.out.println(naturalSum(n)); 

        // int n=25 ;
        // System.out.println(fib(n));

        // int arr[]={1,2,3,5,4};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 5, 0));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(lastOccurence(arr, 5, 0));

        //System.out.println(power(2, 10)); 

         int a=2;
         int n=5;
         System.out.println(optimizedPower(a, n));
    }

}
