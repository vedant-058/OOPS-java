package Question5;

public class Registration_Number {
    String r;
    Registration_Number(String s){
        r=s;
    }
    void check(){
        String state=r.substring(0, 2);
        String code=r.substring(2, 5);
        String character=r.substring(6, 8);
        String number=r.substring(8);
        if(Check_states(state) && 
        Check_district(code) &&
        Check_character(character) &&
        Check_number(number)){
            System.out.println("Entered number is valid: "+r);
        }

    }

    boolean Check_states(String s){
        String[] states={"AP","DL","GJ","MH","MP" };
        for (int i = 0; i < states.length; i++) {
            if(states[i].equals(s)){
                System.out.println(r.substring(0, 2)+" Is a Valid State");
                return true;
            }
        }
        System.out.println("Invalid State code");
        return false;
    }
    boolean Check_district(String s){
        String[] codes={"-31","-49","-40","-09","-1" };
        for (int i = 0; i < codes.length; i++) {
            if(codes[i].equals(s)){
                System.out.println(r.substring(3, 5)+" Is a Valid District");
                return true;
            }
        }
        System.out.println("Invalid District code");
        return false;
    }
    boolean Check_character(String s){
        char[] a=s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=65 && a[i]<=90){
                System.out.println(r.substring(6, 8)+" Is a Valid Character");
                return true;
            }
        }
        System.out.println("Invalid Character code");
        return false;
    }boolean Check_number(String s){
        char[] a=s.toCharArray();
        for (int i = 0; i < a.length; i++) {
             if(a[i]>=48 && a[i]<=57){
                System.out.println(r.substring(9)+" Is a Valid Sequence number");
                return true;
            }
        }
        System.out.println("Invalid Sequence code");

        return false;
    }
}
