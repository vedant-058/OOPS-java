//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        createtree();
//    }
//    static node createtree(){
//        Scanner sc=new Scanner(System.in);
//        int data=sc.nextInt();
//        if(data==-1) return null;
//        node newnode=new node(data);
//        newnode.left=createtree();
//        newnode.right=createtree();
//        return newnode;
//    }
//}
//class node{
//    node left,right;
//    int d;
//    node(int d){
//        this.d=d;
//    }
//}