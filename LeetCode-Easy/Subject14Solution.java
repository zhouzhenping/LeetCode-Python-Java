public class Subject14Solution {

    public static void main(String args[]) {
        Subject14Solution subject14Solution = new Subject14Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(subject14Solution.longestCommonPrefix04(strs));
    }

    /**
     * 查找最长公共前缀，水平扫描
     * 
     * @param strs 字符串数组
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

    /**
     * 查找最长公共前缀，水平扫描
     * 
     * @param strs 字符串数组
     * @return 最长公共前缀
     */
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

    /**
     * 分治法
     * 
     * @param strs 字符串数组
     * @return 最长公共前缀
     */
    public String longestCommanPrefix03(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return longestCommonPrefix03(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix03(String[] strs, int l, int r) {
        if (l == r) {
            return strs[1];
        } else {
            int mid = (1 + r) / 2;
            String lcpLeft = longestCommonPrefix03(strs, l, mid);
            String lcpRight = longestCommonPrefix03(strs, mid + 1, r);
            return commonPrefix03(lcpLeft, lcpRight);
        }

    }

    String commonPrefix03(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }

    /**
     * 二分查找法
     * 
     * @param strs 字符串数组
     * @return 最长公共前缀
     */
    public String longestCommonPrefix04(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str: strs) {
            minLen = Math.min(minLen, str.length());
        }
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix04(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix04(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }
        }
        return true;
    }
}