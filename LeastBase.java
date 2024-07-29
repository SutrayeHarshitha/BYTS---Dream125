public class LeastBase {
    public static int findLeastBase(String number) {
        int maxDigit = 0;
        for (char c : number.toCharArray()) {
            int digitValue;
            if (c >= '0' && c <= '9') {
                digitValue = c - '0';
            } else if (c >= 'A' && c <= 'Z') {
                digitValue = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid character in number string");
            }
            if (digitValue > maxDigit) {
                maxDigit = digitValue;
            }
        }
        return maxDigit + 1;
    }
    public static void main(String[] args) {
        String number1 = "101";
        String number2 = "2F";
        String number3 = "1A3";
        System.out.println("Least base for " + number1 + ": " + findLeastBase(number1)); // Output: 2
        System.out.println("Least base for " + number2 + ": " + findLeastBase(number2)); // Output: 16
        System.out.println("Least base for " + number3 + ": " + findLeastBase(number3)); // Output: 14
    }
}
