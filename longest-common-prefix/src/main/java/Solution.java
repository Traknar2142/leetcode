class Solution {
    public String longestCommonPrefix(String[] strs) {
        String cur = strs[0];
        StringBuilder resultPref = new StringBuilder("");
        for (int i = 0; i < cur.length(); i++) {
            char character = cur.charAt(i);
            resultPref.append(character);
            for (int j = 1; j <= strs.length-1; j++) {
                if (!strs[j].startsWith(resultPref.toString())){
                    return resultPref.deleteCharAt(resultPref.length()-1).toString();
                }
            }
        }
        return resultPref.toString();
    }
}