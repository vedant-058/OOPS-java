/*
class gen<t extends Number>{
    t[] nums;
    gen(t[] nums){
        this.nums=nums;
    }
    double sum=0;
    void average(){
        for (int i = 0; i < nums.length; i++) {
              sum+=nums[i].intValue();
        }
        System.out.println(sum/ nums.length);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4};


    }
}*/

import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(1.3);
        a.add(2.1);
        a.add("Hi");
        a.add(true);
        if (a.contains(2.1))
            System.out.println("Contains 2.1");
        else
            System.out.println("Not Contains 2.1");
        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}