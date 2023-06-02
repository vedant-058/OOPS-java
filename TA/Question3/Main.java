package Question3;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] decimalArray =new int[6];
        int multiplier=1;
        System.out.println("Enter Array input:");
        for (int i = 0; i < decimalArray.length; i++) {
            decimalArray[i]=sc.nextInt();
        }
        System.out.println("Enter Multiplier:");
        multiplier=sc.nextInt();
        int wholeNumberPart = DecimalArrayMultiplier.multiplyAndReturnWholeNumber(decimalArray, multiplier);

        System.out.println("Whole number part: " + wholeNumberPart);
        System.out.println("Updated decimal array: " + Arrays.toString(decimalArray));
        sc.close();
    }
}