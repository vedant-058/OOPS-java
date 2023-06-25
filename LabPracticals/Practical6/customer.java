import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class customer {
    int cid;// customer id
    product p;// product
//    sales.txt store customer details whenever customer buys pdt.
    customer(int customer_id,product p){
        cid=customer_id;
        this.p=p;
    }
    void cstfile() throws IOException {
        File f=new File("sales.txt");

    }

    public static void main(String[] args) throws FileNotFoundException {
        product a=new product(8123,100,2,"wildstone");
        customer c=new customer(234,a);
    }
}
