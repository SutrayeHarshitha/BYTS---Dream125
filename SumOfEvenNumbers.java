/* Any integer number that is completely divided by 2 is known as the even number. 
All the even numbers must be divided by 2. */

import java.util.*;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            int evenNumber = 2 * i;
            sum = sum+ evenNumber;
        }
        System.out.println("Sum of the first " + n + " even numbers: " + sum);
    }
}

