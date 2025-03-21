class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;   // No carry, return the result
            }
            digits[i] = 0;       // Set current digit to 0 and continue (carry over)
        }

        // If all digits were 9, create a new array with one extra digit
        int[] result = new int[n + 1];
        result[0] = 1;           // Set the leading digit to 1
        return result;
    }
}
