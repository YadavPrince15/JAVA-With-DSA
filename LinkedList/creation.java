package JAVA_CODE.LinkedList;
import java.util.LinkedList;
public class creation {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        LinkedList ll = new LinkedList();
       // ll.head = new Node(1);
    }
}
