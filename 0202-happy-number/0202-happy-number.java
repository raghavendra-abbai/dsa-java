class Solution {

    public int sumOfSquaresOf(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        int slow = sumOfSquaresOf(n);
        int fast = sumOfSquaresOf(sumOfSquaresOf(n));

        while (fast != 1 && slow != fast) {

            slow = sumOfSquaresOf(slow);

            fast = sumOfSquaresOf(sumOfSquaresOf(fast));
        }

        return fast == 1;
    }
}