import java.util.Scanner;

/*import java.util.Scanner;

public class psvm {
    public static void main(String[] args) {
        Node n1=buildtree();
        displayinorder(n1);
    }
    static Node buildtree(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Root: ");
        int data =sc.nextInt();
        if(data==-1)return null;
        Node newnode=new Node(data);
        System.out.println("Left: "+data);
        newnode.left=buildtree();
        System.out.println("Right: "+data);
        newnode.right=buildtree();
        return newnode;
    }
    static void displayinorder(Node n){
        System.out.println("Inorder: ");
        if(n==null){
            return;
        }
        displayinorder(n.left);
        System.out.println(n.data);
        displayinorder(n.right);
    }
    static void displaypreorder(Node n){
        System.out.println("Preorder: ");
        if(n==null){
            return;
        }
        System.out.println(n.data);
        displayinorder(n.left);
        displayinorder(n.right);
    }
    static void displaypostorder(Node n){
        System.out.println("Postorder: ");
        if(n==null){
            return;
        }
        displayinorder(n.left);
        displayinorder(n.right);
        System.out.println(n.data);
    }
}
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
    }
}*/
public class psvm{
    public static void main(String[] args) {
        node newnode=buildtree();
//        inorder(newnode);
//        System.out.println("Height is: "+height(newnode));
//        System.out.println("Size is: "+size(newnode));
        System.out.println("Max is: "+max(newnode));
    }
    static node buildtree(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data: ");
        int data=sc.nextInt();
        node n=new node(data);
        if(data==-1)   return null;
        System.out.println("Enter left of "+data+" : ");
        n.left=buildtree();
        System.out.println("Enter right of "+data+" : ");
        n.right=buildtree();
        return n;
    }
    static void inorder(node n){
        if(n==null) return;
        inorder(n.left);
        System.out.println(n.data);
        inorder(n.right);
    }

    static int height(node p){
        if(p==null) return 0;
        int x=height(p.left);x++;
        int y=height(p.right);y++;
        if(x>y)return x;
        return y;
    }
    static int size(node n){
        if(n==null) return 0;
        int l=size(n.left);
        int p=size(n.right);
        return (l+p)+1;
    }
    
}
class node{
    node left,right;
    int data;
    node(int data){
        this.data=data;
    }
}