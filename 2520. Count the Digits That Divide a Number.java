class Solution {
    public int countDigits(int num) {
        int count = 0;
        int digits = num;
        while (digits > 0) {
            int digit = digits % 10;
            if (num % digit == 0)
                count++;
            digits /= 10;
        }
        return count;
    }
}