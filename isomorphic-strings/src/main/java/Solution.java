import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == t.length()) {
            String s1 = convertIntoDigitString(s);
            String t1 = convertIntoDigitString(t);
            return s1.equals(t1);
        }
        return false;
    }

    private String convertIntoDigitString(String str) {
        Map<String, String> dict = new HashMap<>();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            String characterString = Character.toString(chars[i]);
            String index = dict.get(characterString);
            if (index == null){
                index = Integer.toString(i);
                dict.put(characterString, index);
            }
            sb.append(index).append(",");
        }
        return sb.toString();
    }
}
