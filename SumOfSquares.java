import java.util.*;
public class SumOfSquares {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for(int i = 0;i <= n; i++) 
            sum += i*1;
        return sum;
    }
    public static void main(String[] args) {
        //int n =5;
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int sum = sumOfSquares(n);
        System.out.println("Sum of sqaures of first" +n+ "naturnal nums is :" +sum);
    }
}
