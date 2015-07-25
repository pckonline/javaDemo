package regex;

/**
 * Created by online on 15-1-31.
 */

/**
 * 正则表达式
 *
 * 正则表达式用于操作字符串数据。
 * 通过一些特定的符号来体现的。
 * 所以我们为了掌握正则表达式，必须要学习一些符号。
 *
 * 虽然简化了，但是阅读性变差了。
 *
 */
public class RegexDemo {
    public static void main(String[] args) {
        String qq="123456";
        String regex = "[1-9][0-9]{4,14}";//正则表达式。
//        boolean b = qq.matches(regex);
//        System.out.println(b);
        String str = "aooooooob";
        String reg = "ao{4,6}b";
        boolean b  = str.matches(reg);
        System.out.println(b);
    }
    /**
     * 需求：定义一个功能对QQ号进行校验。
     * 要求：长度5-15。只能是数字，0不能开头
     */
}
