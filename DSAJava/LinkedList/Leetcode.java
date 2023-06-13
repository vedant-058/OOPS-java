public class Leetcode {
    class node{
        int data;
        node next;
        node(){
            this.data=0;
            this.next=null;
        }
    }
    node head;
    public node createnode(){
        node newnode=new node();
        return newnode;
    }
    public void addlast(int data){
        node newnode=createnode();
        newnode.data=data;
        
        if(head==null){
            head=newnode;
        }
        else{
            node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
        }
    }
    
    int num;
    public int read(Leetcode one){
        node temp=head;
        while(temp!=null){
            num=num*10+ temp.data;
            temp=temp.next;
        }
        int p=0,sum=0;
        while(num>0){
            p=num%10;
            sum=sum*10+p;
            num=num/10;
        }
        return sum;
    }
}
