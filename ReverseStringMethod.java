/**
 * Java笔记：三种常用字符串反转（reverse）方法
 */
public class ReverseStringMethod {
    public static String reverse01(String string) {
        // StringBuffer 类和 String 类一样，亦可以代表字符串。相比 String，StringBuffer 在进行字符串处理时，如果
        // 不生成新的对象，在内存使用上由于 String 类。当遇到插删除等字符操作时，可以考虑 StringBuffer()。
        return new StringBuffer(string).reverse().toString();
    }

    public static String reverse02(String s) {
        char[] array = s.toCharArray();
        String newReverse = "";
        for (int i = array.length - 1; i >= 0; i--) {
            newReverse += array[i];
        }
        return newReverse;
    }

    public static String reverse03(String s) {
        String newReverse = "";
        for (int i = 0; i < s.length(); i++) {
            newReverse = s.charAt(i) + newReverse;
        }
        return newReverse;
    }
}