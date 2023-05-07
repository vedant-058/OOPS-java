package Practical2;

public class time {
    int h,m,s;
    int h1,m1,s1;
    time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    time add(time a,time b){
        System.out.println("The addition of time is: ");
        time c=new time(0,0,0);
        c.h=a.h+b.h;
        if(c.h>=24){
            c.h=c.h%24;
        }
        c.m=a.m+b.m;
        if(c.m>=60){
            c.m=c.m%60;
            c.h++;
        }
        c.s=a.s+b.s;
        if(c.s>=60){
                c.s=c.s%60;
                c.m++;
        }
        display(c);
        return c;
    }
    time sub(time a,time b){
        System.out.println("The Subtraction of time is: ");
        time c=new time(0,0,0);
        c.h=a.h-b.h;
        c.m=a.m-b.m;
        c.s=a.s-b.s;
        if(c.h<0){
            c.h=c.h*(-1);
        }
        if(c.m<0){
            c.m=c.m*(-1);
        }
        if(c.s<0){
            c.s=c.s*(-1);
        }
        if(c.h>=24){
            c.h=0; 
        }
        if(c.m>=60){
            c.m=c.m%60;
            c.h++;
        }
        if(c.s>=60){
            c.s=c.s%60;
            c.m++;
        }
        display(c);
        return c;
    }
    void display(time x){
        System.out.println("The Final Time is\n"+x.h+" : "+x.m+" : "+x.s);
    }
}
