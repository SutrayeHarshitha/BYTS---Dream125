public class LargestFact {


    public static int largestFactor(int num) {
        
        for (int i = num / 2; i >= 2; i--) {
            if (num % i == 0) {
                return i; 
            }
        }
        return 1; 
    }
    public static void main(String[] args) {
        int num = 28;  
        int largestFactor = largestFactor(num);
        System.out.println("The largest factor of " + num + " (other than itself) is: " + largestFactor); 
    }
}
