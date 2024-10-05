package JAVA_CODE.LinkedList;
import java.util.LinkedList;
//Using Java Collection FrameWork(JCF)
public class LL_In_Collection_FrameWork {
    public static void main(String[] args) {
        //Create - (Objects) int ,float, boolean -> Integer,Float,Boolean
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
