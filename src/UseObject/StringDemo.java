package UseObject;

/**
 * Created by online on 14-12-3.
 */

/**
 * String类的特点：
 * 字符串对象一旦被初始化就不会被改变
 *
 */

public class StringDemo
{
    public static void main(String[] args)
    {
        StringDemo2();
    }
    public static void StringDemo2()
    {
        String s = "abc";//创建一个字符串对象在常量池中
        String s1 = new String("abc");//创建两个对象一个new 一个字符串对象在堆内存中

        System.out.println(s1==s);//false
        System.out.println(s.equals(s1));//true,String 类中的equals复写了Object中equals
        // 建立了string类自己的判断字符串对象是否相同，其实就是比较字符串内容。
//        System.out.println("s="+s);
//        System.out.println("s1="+s1);
    }

    /**
     * 演示字符串定义的第一种方式，并明确字符串常量池
     * 池中没有就建立，有就直接用
     */
    private static void StringDemo1() {
        String s = "abc";//"abc"存储在字符串常量池中
        String s1 = "abc";
        System.out.println(s1==s);
    }
}
