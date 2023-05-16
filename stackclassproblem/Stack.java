package stackclassproblem;
public class Stack{
    int s;
    int top;
    int[] a;
    Stack(int s){
        this.s=s;  
        this.a=new int[s];
        top=-1;      
    }
    
    boolean isfull(int top){
        if(top==s-1)
            return true;
        else 
            return false;
    }
    boolean isempty(int top){
        if(top==-1)
            return true;
        else{
            return false;
        }
    }
    void push(int d){
        if(isfull(top))
            System.out.println("Stack is full");
        else{
            top++;
            a[top]=d;
        }
    }
    void pop(){
        if(isempty(top))
            System.out.println("Stack is empty");
        else{
            int d=a[top];
            a[top]=0;
            top--;
            System.out.println(d);
        }
    }
    void peek(){
        if(isempty(top))
            System.out.println("Stack is empty");
        else{
            int d=a[top];
            System.out.println(d);
        }
    }
    void display(){
        if(isempty(top))
            System.out.println("Stack is empty");
        else{
            for(int i=0;i<=top;i++){
                System.out.println(a[i]);
            }
        }
    }
}