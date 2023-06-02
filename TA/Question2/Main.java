package Question2;

public class Main{
    public static void main(String[] args) {
        int a = 2;
        int n = 3;
        MinimumMultiplications x=new MinimumMultiplications();
        int minMultiplications = x.findMinimumMultiplications(a, n);
        System.out.println("Minimum number of multiplications: " + minMultiplications);
    }
}
