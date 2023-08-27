import java.lang.reflect.Array;

public class gen<T,K> {
    T data;
    K p;
    Class<T> clazz;T[] array;
    gen(T d,K p){
        array = (T[]) Array.newInstance(clazz,5);
        data=d;
        this.p=p;
    }
    void display(){

        System.out.print("Data1: "+data);
        System.out.println("\tData2: "+p);
    }
}
