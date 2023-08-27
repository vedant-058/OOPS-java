import java.util.*;
class decomparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2)return -1;
        else if (o1<o2)return 1;
        return 0;
    }
}
public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(4);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(27);
//        Iterator itr=a.iterator();
        Collections.sort(a,new decomparator());
        System.out.println(a);
    }
}
