package LongestCommonPrefix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        Arrays.sort(strs);
        int i = 0;
        List<Character> result = new ArrayList<>();
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = (first.length() <= last.length()) ? first.length() : last.length();

        if (first == null || first.length() == 0 || last == null || last.length() == 0) return "";
        while ((first.charAt(i)) == (last.charAt(i)) && i < (minLength - 1)) {


            result.add(first.charAt(i));
            System.out.println(first.charAt(i));

            i++;

        }

        return result.stream().map(Object::toString)
                .collect(Collectors.joining());


    }

    public static void main(String[] args) {
        String[] p = {"c", "c"};
        System.out.println(longestCommonPrefix(p));
    }
}
