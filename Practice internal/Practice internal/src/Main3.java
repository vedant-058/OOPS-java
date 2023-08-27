import java.util.Iterator;
import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(5);
        ll.add(3);
        Iterator itr=ll.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
