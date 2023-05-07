package Practical2;

public class attendence {
    time a,b;
    attendence(time a,time b){
        this.a=a;
        this.b=b;
    }
    time attended(time a,time b){
        System.out.println("The time for which office is attended is:");
        time c=new time(0,0,0);
        c=a.sub(a, b);
        return c;
    }
}
