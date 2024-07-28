/* A perfect num is a positive integer that is equal to the sum of its proper divisors */


public class PerfectNumber {
    public boolean checkPerfectNumber(int nums) {
        if(nums<=0)  return false;
        int sum=0;
        for(int i=1;i<nums/2;i++) 
            if(nums % i == 0) 
                sum+=i;
        return sum ==nums;
    }
    public static void main(String[] args) {
        PerfectNumber pn = new PerfectNumber();
        System.out.println(pn.checkPerfectNumber(6));
    }
}
