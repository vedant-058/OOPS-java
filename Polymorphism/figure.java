class figure{
    double x,y;
    figure(double x,double y){
        this.x=x;
        this.y=y;
    }
}
class rectangle extends figure{
    double l,b;
    rectangle(double l,double b){
        super(l, b);
        this.l=l;
        this.b=b;
        display();
    }
    double area(double x,double y){
        return x*y;
    }
    void display(){
        System.out.println("The object chosen is Rectangle and area is: "+area(x,y));
    }
}
class triangle extends figure{
    double b,h;
    triangle(double b,double h){
        super(b, h);
        this.b=b;
        this.h=h;
        display();
    }
    double area(double x,double y){
        return 0.5*x*y;
    }    
    void display(){
        System.out.println("The object chosen is Triangle and area is: "+area(x,y));
    }
}