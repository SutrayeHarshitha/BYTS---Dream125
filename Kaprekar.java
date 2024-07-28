public class Kaprekar {
    public static void main(String[] args) {
        int num = 45; // example number
        System.out.println(num + " is a Kaprekar number: " + isKaprekar(num));
    }

    public static boolean isKaprekar(int num) {
        int square = num * num;
        String squareStr = String.valueOf(square);
        int len = squareStr.length();
        for (int i = 1; i < len; i++) {
            int part1 = Integer.parseInt(squareStr.substring(0, i));
            int part2 = Integer.parseInt(squareStr.substring(i));
            if (part1 + part2 == num) {
                return true;
            }
        }
        return false;
    }
}

