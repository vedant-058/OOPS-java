package Booksandtapes;

class publication {
    String title;
    float price;
    publication(String title,float price){
        this.title=title;
        this.price=price;
    }
}
class book extends publication{
    int c;
    book(String title,float price,int c){
        super(title,price);
        this.c=c;
        display();
    }
    void display(){
        System.out.println("Pages of Book: "+c);
    }
}
class tape extends publication{
    float m;
    tape(String title,float price,float m){
        super(title,price);
        this.m=m;
        display();
    }
    void display(){
        System.out.println("Minutes of tape: "+m);
    }
}

