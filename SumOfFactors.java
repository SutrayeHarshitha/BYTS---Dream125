public class SumOfFactors {
    public static int calculateSumOfFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { 
                sum += i;       
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int num = 28;
        int sumOfFactors = calculateSumOfFactors(num);
        System.out.println("The sum of the factors of " + num + " is: " + sumOfFactors);

    }
    
    
}
