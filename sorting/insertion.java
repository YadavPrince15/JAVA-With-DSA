import java.util.Arrays;
import java.util.Collections;
public class insertion {
    public static void insertionSort(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct position to insert
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};
     //   insertionSort(arr);
     //   Arrays.sort(arr);     //Inbuilt sorting technique
      //  Arrays.sort(arr,0,3);
     //     Arrays.sort(arr,Collections.reverseOrder());
         Arrays.sort(arr,0,3,Collections.reverseOrder());

        printArr(arr);
    }
}
