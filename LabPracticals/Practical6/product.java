import java.io.*;

public class product implements Serializable{
    int pid; // productid
    double p; // price
    int q; // quantity
    String n; // name
    product(){}
    product(int productid,double price,int quantity,String name) throws FileNotFoundException {
        pid=productid;
        p=price;
        q=quantity;
        n=name;
    }
    void pdtfile(product p){
        try{
            File f=new File("productfile.txt");
            if(f.createNewFile()){
                System.out.println("File created: "+f.getName());
            }
            else{
                System.out.println("File already exists.");
            }
            System.out.println();
            FileOutputStream fos=new FileOutputStream("productfile.txt",true);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.flush();
            System.out.println("Write successfull");
            System.out.println();

            product emptypdt = new product();
            product pdt = (product) emptypdt.ReadObjectFromFile("productfile.txt");
            System.out.println();
            System.out.println("Read succesfull");
            System.out.println();
            display(pdt);
        }
        catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    void display(product pdt){
        System.out.println("Product Name: "+pdt.n);
        System.out.println("Product ID: "+pdt.pid);
        System.out.println("Product Quantity: "+pdt.q);
        System.out.println("Product Price: "+pdt.p);
    }
    public Object ReadObjectFromFile(String filepath) {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        product a=new product(8123,100,2,"wildstone");
        product b=new product(8121,122,1,"Sparx");
        a.pdtfile(a);
        b.pdtfile(b);
    }
}
