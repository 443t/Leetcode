package ReverseInteger;

public class ReverseInteger {
    static int reverse(int x) {
        if (x > -10 && x < 10) {
            return x;
        }
        int plus = 1;
        int res = 0;
        if (x < 0) plus = -1;
        x = Math.abs(x);

        while (!(x == 0)) {
            int rightBound = x % 10;
            int newRes = res * 10 + rightBound;
            if ((newRes - rightBound) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }

        return res * plus;
    }

    public static void main(String args[]) {
        System.out.println(reverse(1534236469));
    }
}
