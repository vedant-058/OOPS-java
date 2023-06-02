package Question6;


public class Main {
    public static void main(String[] args){

        
        System.out.println("Part one of Question Giving simple addition and substraction of HOURS MINUTES SECOND");
        timeTA x=new timeTA(12, 42, 55);
        timeTA y=new timeTA(2, 4, 5);
        x.add(x, y);
        y.sub(x, y);
        System.out.println("\n\n");

        System.out.println("Part two of Question Giving simple addition and substraction For Scientific Calculator of HOURS MINUTES SECOND MILLISECOND");
        timecalTA a=new timecalTA(10, 20, 12,11);
        timecalTA b=new timecalTA(2,4,12,32);
        timecalTA c=new timecalTA(0, 0, 0, 0);
        c.add(a, b);
        c.sub(a, b);
        System.out.println("\n\n");

        System.out.println("Part Three of Question Giving simple Timezone of the countries: ");
        timezone v=new timezone(x);
        v.timeTAc(x);

    }
}
