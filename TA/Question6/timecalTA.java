package Question6;

public class timecalTA {
    int h,m,s,ms;
    int h1,m1,s1;
    timecalTA(int h,int m,int s,int ms){
        this.h=h;
        this.m=m;
        this.s=s;
        this.ms=ms;
    }
    timecalTA add(timecalTA a,timecalTA b){
        System.out.println("The addition of time calculator is: ");
        timecalTA c=new timecalTA(0,0,0,0);
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
        c.ms=a.ms+b.ms;
        if(c.ms>=60){
                c.ms=c.ms%60;
                c.s++;
        }
        display(c);
        return c;
    }
    timecalTA sub(timecalTA a,timecalTA b){
        System.out.println("The Subtraction of time calculator is: ");
        timecalTA c=new timecalTA(0,0,0,0);
        c.h=a.h-b.h;
        c.m=a.m-b.m;
        c.s=a.s-b.s;
        c.ms=a.ms-b.ms;
        
        if(c.h<0){
            c.h=c.h*(-1);
        }
        if(c.m<0){
            c.m=c.m*(-1);
        }
        if(c.s<0){
            c.s=c.s*(-1);
        }
        if(c.ms<0){
            c.ms=c.ms*(-1);
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
        if(c.ms>=60){
            c.ms=c.ms%60;
            c.s++;
        }
        display(c);
        return c;
    }
    
    void display(timecalTA x){
        System.out.println("The Final Time calculator is\n"+x.h+" : "+x.m+" : "+x.s+" : "+x.ms);
    }
}
