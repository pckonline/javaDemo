package UseObject;

/**
 * Created by online on 14-12-7.
 */

/**
 * 基本数据类型包装类
 * 为了方便操作基本数据类型值，将其封装成了对象，在对象中定义类属性和行为丰富了该数据的操作
 * 用于描述该对象的类，就成为基本数据类型对象包装类
 *
 * byte    Byte
 * short   Short
 * int     Integer
 * long    Long
 * float   Float
 * double  Double
 * char    Character
 * boolean Boolean
 *
 * 该包装对象主要用基本类型和字符串之间的转换
 *  基本类型-->字符串：
 *      1.基本类型+""
 *      2.用String类中的静态方法valueOf(基本类型数值)
 *      3.用Integer的静态方法valueOf(基本类型数值)
 *
 * 字符串-->基本类型
 *      1.使用包装的静态方法：xxx parseXxx("基本类型数值字符串")
 *          int parseInt("123")
 *          long parseLong("long型数值")
 *          boolean parseBoolean("booleanString")
 *          只有Character没有parse方法
 *      2.如果字符串被Integer进行对象的封装。
 *      可使用另一个非静态的方法，intValue();
 *      将一个Integer对象转成基本数据类型值
 */
public class WrapperDemo
{
    public static void main(String[] args)
    {
//        System.out.println(Integer.MAX_VALUE);
//        int num = 4;
//        Integer i = new Integer("123");

//         int x = i.parseInt("123");
//        System.out.println(x);
//        System.out.println(i.intValue()+1);
//        System.out.println(Integer.parseInt("123")+1);
        /**
         * 整数具备不同的进制体现。
         *
         * 十进制转成其他进制
         *
         * 其他进制转成十进制
         */
        //十进制转成其他进制
//        System.out.println(Integer.toBinaryString(60));
//        System.out.println(Integer.toOctalString(60));
//        System.out.println(Integer.toHexString(60));
//        System.out.println(Integer.toString(60,16));
//        其他进制转成十进制。
//        System.out.println(Integer.parseInt("3c",16));

        Integer a = new Integer("123");
        Integer b = new Integer(123);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));

    }
}
