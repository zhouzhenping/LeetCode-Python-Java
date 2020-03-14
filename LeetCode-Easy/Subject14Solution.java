public class Subject14Solution {

    public static void main(String args[]) {
        // TODO
    }

    /**
     * 查找最长公共前缀，水平扫描
     * 
     * @param strs 字符串数据
     * @return 最长公共前缀
     */
    public String longestCommonPrefix01(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public String longestCommonPrefix02(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i ++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}