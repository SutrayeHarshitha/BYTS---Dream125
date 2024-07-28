import java.util.*;
public class ArmstrongNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int n = sc.nextInt();
        int temp = n;
        int ans = 0;
        while(n!=0) {
            int rem = n%10;
            ans+=Math.pow(rem,3);
            n/=10;
        }
        if(ans==temp) System.out.println("yes");
        else System.out.println("No");
    }
}