public class Subject07Solution {
    /**
     * 一次构建反转整数的一位数字，并且预先检查原整数附加另一位数字是否会导致溢出
     */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            } 
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }


     public static void main(String args[]) {
         Subject07Solution subject07Solution = new Subject07Solution();
         int x1 = 123;
         System.out.println(subject07Solution.reverse(x1));
         int x2 = -123;
         System.out.println(subject07Solution.reverse(x2));
         int x3 = 120;
         System.out.println(subject07Solution.reverse(x3));
     }
}