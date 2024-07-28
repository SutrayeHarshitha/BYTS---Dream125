import java.util.*;
public class OddEven {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if((n&1)==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        /*if(n%2==0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        } */
    }
}
