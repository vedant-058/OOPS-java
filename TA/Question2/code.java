package Question2;
class MinimumMultiplications {
    int findMinimumMultiplications(int a, int n) {
        if (n == 0) {
            return 0; // Base case: a^0 = 1 (no multiplications needed)
        }
        int minMultiplications = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int multiplications;
            if (i % 2 == 0) {
                multiplications = 1 + findMinimumMultiplications(a * a, n / 2);
            } 
            else {
                multiplications = 1 + findMinimumMultiplications(a * a, (n - 1) / 2);
            }
            if (multiplications < minMultiplications) {
                minMultiplications = multiplications;
            }
        }
        return minMultiplications;
    }
}
