import java.util.ArrayList;

public class AddToBase {
    
    public String baseNeg2(int n) {
         if (n == 0) return "0";
        ArrayList<Integer> al = new ArrayList<>();
         while (n != 0) {
            int rem = n % -2;
            n = n / -2;
             if (rem < 0) {
                rem += 2;
                n += 1;
            } al.add(rem);
        }
        char[] arr = new char[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = (char) (al.get(al.size() - 1 - i) + '0');
        }
        return new String(arr);
    }
}
