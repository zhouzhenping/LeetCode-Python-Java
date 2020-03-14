import java.util.HashMap;
import java.util.Map;

public class Subject13Solution {
    public static void main(String args[]) {
        Subject13Solution subject13Solution = new Subject13Solution();
        System.out.println(subject13Solution.romanToInt("IVXC"));
    }

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 100);

        int ans = 0;
        for(int i = 0; i < s.length();) {
            if(i + 1 < s.length() && map.containsKey(s.substring(i, i+2))) {
                ans += map.get(s.substring(i, i+2));
                i += 2;
            } else {
                ans += map.get(s.substring(i, i + 1));
                i ++;
            }
        }
        return ans;
    }
}