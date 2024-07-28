


public class MinSumOfDigits {
    public static void main(String[] args) {
        int minSum = Integer.MAX_VALUE;
        for (int i = 1000; i <= 9999; i++) {
            int sum = sumOfDigits(i);
            if (sum < minSum) {
                minSum = sum;
            }
        }
        System.out.println("Minimum sum of 4 digits: " + minSum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
