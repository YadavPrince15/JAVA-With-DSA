//import java.util.*;
public class Array {
    public static void update(int marks[],int nonChangable){
        nonChangable=10;
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length ;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int getLargest(int number[]){
        int largest=Integer.MIN_VALUE;  //-infinity
        int smallest=Integer.MAX_VALUE;  //+infinity

        for(int i=0;i<number.length;i++){
            if(largest < number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("Smallest value is :"+smallest);
        return largest;
    }
    public static int binarySearch(int num[],int key){
        int start=0,end= num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparision
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){  //right
                start=mid+1;
            }else{  //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverse(int n[]){
        int first =0, last=n.length-1;
        while (first<last) {
            //swap
            int temp=n[last];
            n[last]=n[first];
            n[first]=temp;

            first++;
            last--;
        }
    }
    public static void printPairs(int no[]){
        int totalPairs=0;
        for(int i=0;i<no.length;i++){
            int curr=no[i];  //2,4,6,8,10
            for(int j=i+1; j<no.length;j++){
                System.out.print("("+curr+","+no[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs="+totalPairs);
    }

    public static void printSubarrays(int numbers[]){
        int ts=0;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){   //print subarray
                    System.out.print(numbers[k]+" ");
                   
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray:"+ts);
    }

    public static void maxSubarraySum(int numbers[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    //print subarray sum
                    currsum+=numbers[k]; 
                }
                System.out.println(currsum);        
                if(maxSum <currsum){
                    maxSum=currsum;
                }
            }
        }
        System.out.println("max sum="+maxSum);
    }

    public static void maxSubarraySum2(int numbers[]){  //Using prefix array
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1 ;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=start==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum <currsum){
                    maxSum=currsum;
                }
            }
        }
        System.out.println("max sum="+maxSum);
    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int  cs=0;

        for(int i=0;i<numbers.length;i++){
            cs =cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Our max sub array is:"+ms);

    }
    public static void main(String[] args) {
      /*   //Basics in array
         int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();  //phy
        marks[1]=sc.nextInt();  //chem
        marks[2]=sc.nextInt();   //math

        System.out.println("phy="+marks[0]);
        System.out.println("chem="+marks[1]);
        System.out.println("math="+marks[2]);

        // marks[2]=100;
        // System.out.println("math="+marks[2]);
        // marks[1]=marks[1]+2;     //here we can add mul div sub in array
        // System.out.println("chem="+marks[1]);

        int percent=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage="+percent+"%");
        System.out.println("Length of array="+marks.length);  
          */

     /*    int marks[]={97,98,99};
        int nonChangable=5;
        update(marks,nonChangable);
        System.out.println(nonChangable);
        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();      */

     /*    //Linear search
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=12;
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index="+index);
        }       */

    /*    //Largest and smallest  number in  array
        int number[]={1,2,6,3,5};
        System.out.println("Largest number in array:"+getLargest(number));
         */

    /*    //Binary search
        int num[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Index for the key is:"+binarySearch(num, key));
         */

    /*     //Reverse of an array
         int n[]={2,4,6,8,10};
         reverse(n);
         for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
         }
         System.out.println();
          */

    /*    //Print pairs in array
        int no[]={2,4,6,8,10};
        printPairs(no);    */

    /*    //Print total subarray
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);     */

    /*    //  Print maximum sum of sub array
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum2(numbers);      */

        //kadanes algorithm for finding max sum of sub array
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

    }
}
