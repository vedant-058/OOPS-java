public class Main {
    public static void main(String[] args) {

        Leetcode a =new Leetcode();
        a.addlast(9);
        a.addlast(9);
        a.addlast(9);
        a.addlast(9);
        a.addlast(9);
        a.addlast(9);
        a.addlast(9);

        Leetcode b=new Leetcode();
        b.addlast(9);
        b.addlast(9);
        b.addlast(9);
        b.addlast(9);

        // a.printlist();
        // b.printlist();

        int x=a.read(a);
        int y=b.read(b);
        int r=x+y;
        int q;

        // while(r>0){
        //     q=r%10;
        //     sum=sum*10+q;
        //     r=r/10;
        // }
        int z=r;
        Leetcode c=new Leetcode();
        while(z>0){
            q=z%10;
            c.addlast(q);
            z=z/10;
        }
        // c.printlist();

        //    ;
    }
    
}
