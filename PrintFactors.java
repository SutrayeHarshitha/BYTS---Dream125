    public class PrintFactors {

        static void printDivisors(int n)
        {
            for (int i = 1; i <= n; i++)
                if (n % i == 0)
                    System.out.print(i + " ");
        }
        public static void main(String args[])
        {
            int n=100;
            printDivisors(n);
            
        }
    
    }
