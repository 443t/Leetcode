package PalindromNumber;

public class PalindromeNumber {

    static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rightPart = 0;
        while (x > rightPart) {
            rightPart = 10 * rightPart + x % 10;
            x = x / 10;
        }

        return (rightPart == x || rightPart == x / 10);

    }


    public static void main(String args[]) {
        System.out.println(isPalindrome(1000021));
    }
}

