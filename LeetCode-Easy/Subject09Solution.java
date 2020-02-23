public class Subject09Solution {
    /**
     * 暴力解法：将数字转换为字符串，然后将字符串分割为数组，循环数字一半长度进行判断
     */
    public boolean solution01(int x) {
        String reversedString = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedString);
    }

    /**
     * 通过取整和取余操作获取整数中对应的数字进行比较
     * 
     * @param x 整数
     * @return 是否回文数
     */
    public boolean solution02(int x) {
        // 边界判断
        if (x < 0) {
            return false;
        }
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

    public static boolean solution03(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }


    public static void main(String[] args) {
        Subject09Solution subject09Solution = new Subject09Solution();
        System.out.println(subject09Solution.solution02(12138));
        System.out.println(Subject09Solution.solution03(12138));
    }
}