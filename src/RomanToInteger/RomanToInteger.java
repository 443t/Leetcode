package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] string = s.toCharArray();
        int res = 0;

        for (int i = 0; i < string.length - 1; i++) {
            if (map.get(string[i]) >= map.get(string[i + 1])) {
                res += map.get(string[i]);
            } else {
                res -= map.get(string[i]);
            }
        }

        return res + map.get(string[string.length - 1]);

    }
}
