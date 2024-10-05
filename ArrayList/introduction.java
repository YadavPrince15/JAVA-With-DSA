package JAVA_CODE.ArrayList;
import java.util.ArrayList;
public class introduction {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //Java collection framework
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Float>list3 = new ArrayList<>();

        list.add(1);  //TC=O(1)
        list.add(3);
        list.add(5);
        list.add(8);
        System.out.println(list); 

        //Get operation -used to give element at any index
        int element = list.get(2);
        System.out.println(element);

        //Delete
        list.remove(3);
        System.out.println(list);

        //set
        list.set(2,12);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


        list.add(1,5);  //O(n)
        System.out.println(list);
    }
}
