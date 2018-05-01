package JewelsAndStones;

import java.util.Set;
import java.util.stream.Collectors;

public class JewelsAndStones {

    static int numJewelsInStones(String J, String S) {

        Set<Character> jewels = J.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());

        char[] stones = S.toCharArray();
        int result = 0;

        for (char c : stones) {
            if (jewels.contains(c)) result++;
        }

        return result;

    }

    public static void main(String args[]) {

        System.out.println(numJewelsInStones("AAaaaA", "SSAab"));
    }
}
