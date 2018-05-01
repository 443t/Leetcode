package JewelsAndStones;

public class JewelsAndStones {

    static int numJewelsInStones(String J, String S) {
        if (J.length() == 0 || S.length() == 0)
            return 0;

        boolean[] dictionary = new boolean[78];

        for (char c : J.toCharArray()) {
            dictionary[c - '0'] = true;
        }

        int result = 0;

        for (char c : S.toCharArray()) {
            if (dictionary[c - '0']) result++;
        }

        return result;

    }

    public static void main(String args[]) {

        System.out.println(numJewelsInStones("AAaaaA", "SSAab"));
    }
}
