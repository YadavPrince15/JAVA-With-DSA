package JAVA_CODE.ArrayList;
import java.util.ArrayList;
public class Size_reverse {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);  
        list.add(3);
        list.add(15);
        list.add(8);
        System.out.println(list.size());

        //print ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+  " ");
        }
        System.out.println();

        // //Reverse of list -O(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max <list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
}
