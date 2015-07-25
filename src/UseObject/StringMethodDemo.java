package UseObject;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by online on 14-12-3.
 */
public class StringMethodDemo
{


    public static void main(String[] args) {
        stringMethodDemo_3();
    }
        /**
         * 按照面向对象的思想对字符串进行功能分类。
         * "abcd"
         *
         * 1.获取：
         * 1.1获取字符串中字符的个数（长度）
         *     int length();
         * 1.2 根据位置获取字符
         *      char charAt(int index)
         *
         * 1.3 根据字符获取字符串中第一次出现的位置
         *      int indexOf(int ch)
         *      int indexOf(int ch,int fromIndex) 从指定位置进行ch的查找第一次出现的位置
         *      int indexOf(String str)
         *      int indexOf(String str,int fromIndex)
         *
                int lastIndexOf(int ch)
         *      int lastIndexOf(int ch,int fromIndex) 从最后位置进行ch的查找第一次出现的位置
         *      int lastIndexOf(String str)
         *      int lastIndexOf(String str,int fromIndex)
         * 1.4  获取字符串中的一部分字符串。也叫子串
         *
         *      String substring(int begin ,int end)包含begin 不包含end
         *
         *
         * 2.转换
         * 2.1  将字符串变成字符串数组，（字符串的切割）
         *      String[] split(String regex)
         * 2.2  将字符串变成字符数组
         *      char[] toCharArray()
         * 2.3  将字符串变成字节数组
         *      byte[] getBytes()
         * 2.4  将字符串中的字母转成大小写
         *      String toUpperCase():大写
         *      String toLowerCase():小写
         * 2.5  将字符串中的内容进行替换
         *      String replace(char oldChar,char newChar)
         *      String replace(String s1,String s2)
         * 2.6  将字符串两端的空格去除
         *      String trip();
         * 2.7  将字符串连接。
         *      String concat(String)
         * 3.判断
         * 3.1  两个字符串是否相同？
         *      boolean equals(Object obj)
         *      boolean equalsIgnoreCase(String str);忽略大小写
         * 3.2  字符串是否包含指定字符串
         *      boolean contains(String str)
         * 3.3  字符串是否以指定字符开头，是否以指定字符结尾
         *      boolean startsWith(String str);
         *      boolean endsWith(String str);
         *
         * 4.比较
         *  4.1 比较两个字符串大小
         *      int compareTo(String anotherString)
         *
         *
         */
        private static void stringMethodDemo_3()
        {
            String s = "abc";
            System.out.println(s.equalsIgnoreCase("ABC"));
            System.out.println(s.contains("bc"));
            String str = "ArrayDemo.java";
            System.out.println(str.startsWith("Array"));
            System.out.println(str.endsWith(".java"));
            System.out.println(str.contains("Demo"));
            System.out.println(str.compareTo("HelloWorld.ArrayDemo.javab"));
        }
        private static void stringMethodDemo_2()
        {
            String s = "张三,李四,王五";
            String[] arr =s.split(",");
            for(int i = 0 ; i< arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            char[] arr1 = s.toCharArray();
            for(int x = 0;x <arr1.length;x++)
            {
                System.out.println(arr1[x]);
            }
            s="ab你";
            byte[] by = s.getBytes();
            for(int i  = 0; i< by.length;i++)
            {
                System.out.println(by[i]);
            }
            System.out.println("Abc".toUpperCase());
            System.out.println("java".replace('a','o'));
            System.out.println("-"+"   ab c    ".trim()+"-");//去除两端的空格
            System.out.println("ab".concat("ss"));
        }
        private static void stringMethodDemo_1()
        {
        String s = "abcdae";
        System.out.println("length="+s.length());
        System.out.println("char:"+s.charAt(2));
        System.out.println("index:"+s.indexOf('a'));
        System.out.println("index:"+s.indexOf('a',3));
        System.out.println("index:"+s.lastIndexOf('a'));

        System.out.println("substring:"+s.substring(2,3));
    }
}
