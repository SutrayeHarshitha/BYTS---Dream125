
// import java.util.*;
// public class GcdOfTwoNums {
//     public static int gcd(int a,int b) {
//         while(b!=0) {
//             int temp = a;
//             a = b;
//             b = temp;
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("GCD of two numbers is :" +gcd(a,b));
//     }
// }
import java.util.*;
class GcdOfTwoNums
{
    static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b); 
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}