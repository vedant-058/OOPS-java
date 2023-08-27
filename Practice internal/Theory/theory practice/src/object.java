import java.io.Serializable;

public class object implements Serializable {
    int p,q;
    object(int x,int y){
        p=x;q=y;
    }
    void display(){
        System.out.println("the sum is: "+(p+q));
    }
}
