
public class EvenOddSeggregate {
    public static void main(String[] args) {
        int n = 156734;
        String str = Integer.toString(n);
        int odd1 = 0;
        int even1 = 0;
        for (int i = 0; i < str.length(); i++) {
            int con = Character.getNumericValue(str.charAt(i));
            if (con % 2 == 0) {
                even1 = even1 * 10 + con;
            } else {
                odd1 = odd1 * 10 + con;
            }
        }
        System.out.println(even1 + " " + odd1);
    }
}