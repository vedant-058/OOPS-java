class LL{
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
    public void addFirst(int data){
        node newnode=createnode();
        newnode.data=data;
        if(head==null){
            head=newnode;
            return;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void printlist(){
        node temp=head;
        if(temp==null)
            System.out.println("Linked is empty");
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print("NULL\n");
        }
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
    public void deletefirst(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        else{
            System.out.println(head.data+" Deleted");
            head=head.next;
        }
    }
    public void deletelast(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        else{
            node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            System.out.println(temp.data+" Deleted");
            temp.next=null;
        }
    }
}