package Question3;

class DecimalArrayMultiplier {
    public static int multiplyAndReturnWholeNumber(int[] decimalArray, int multiplier) {
        int carry = 0;

        for (int i = decimalArray.length - 1; i >= 0; i--) {
            int product = decimalArray[i] * multiplier + carry;
            decimalArray[i] = product % 10;
            carry = product / 10;
        }

        return carry; // The remaining carry represents the whole number part of the result
    }
}
    

