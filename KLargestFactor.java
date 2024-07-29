class KLargestFactor {
    static int KthLargestFactor(int N, int K)
    {
        for (int i = N; i > 0; i--) {
            if (N % i == 0) K--;
            if (K == 0) return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int N = 12, K = 3;
        System.out.println(KthLargestFactor(N, K));
    }
}