package Question4;
class arithmetic{
    double x,y;
    arithmetic(double m,double n){
        x=m;
        y=n;
    }
    void add(){
        System.out.println("The addition of two numbers is: "+(x+y));
    }
    void sub(){
        if(x>y)
            System.out.println("The subtraction of two numbers is: "+(x-y));
        else
            System.out.println("The subtraction of two numbers is: "+(y-x));
    }
}