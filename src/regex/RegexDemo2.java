package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by online on 15-1-31.
 */
public class RegexDemo2 {
    public static void main(String[] args) {
        /**
         * 正则表达式对字符串的常见操作;
         * 1.匹配
         *      其实使用的就是String类中的matches方法
         * 2.切割
         *      其实就是String类中的split方法
         * 3.替换
         *      其实使用的就是String类中的replaceAll()方法
         * 4.获取
         *
         *
         */
//        functionDemo_1();//匹配
//        functionDemo_2();//切割
        functionDemo_3();//替换
//          functionDemo_4();
    }
    /**
     * 演示获取
     * 将正则规则进行对象的封装。
     * Pattern p =Pattern.compile("a*b");
     * 通过正则对象的matcher方法字符串相关联。获取要对字符串操作的匹配器对象Matcher
     * Matcher m = p.matcher("aaaab);
     * 通过matcher匹配器对象的方法对字符串进行操作。
     * boolean b =m.matches();
     */
    private static void functionDemo_4() {
        String str = "da jia hao,ming tian bu fang jia!";
        String regex = "\\b[a-z]{3}\\b";//只匹配3个字母
        //将正则封装承对象
        Pattern p = Pattern.compile(regex);
        //通过正则对象获取匹配器对象
        Matcher m = p.matcher(str);
        //使用Matcher对象的方法对字符串进行操作。
        //既然要获取三个字母组成的单词
        //查找  find();
        while (m.find()) {
            System.out.println(m.group());//获取匹配的子序列
            System.out.println(m.start()+":"+m.end());
        }
    }

    /**
     * 演示替换
     */

    public static void functionDemo_3() {
        String str = "zhangsanttttxiaoqiangmmmmzhaoliu";
        str = str.replaceAll("(.)\\1+","$1");//美元符号可以对象前一个正则参数的几组进行使用
        System.out.println(str);
        String tel ="15800001111";//158****1111
        tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        System.out.println(tel);
    }

    /**
     * 演示切割
     */

    public static void functionDemo_2(){
        String str = "zhangsanttttxiaoqiangmmmmzhaoliu";
        String[] names = str.split("(.)\\1+");//以重复的字符分割，就是多个重复的字符为一组//split("\\.");
        for (String s:names){
            System.out.println(s);
        }
    }


    /**
     * 演示匹配
     */
    public static void functionDemo_1(){
        //匹配手机号码是否正确
        String tel = "15800001111";
        String regex = "1[358]\\d{9}";

        boolean b = tel.matches(regex);
        System.out.println(b);
    }
}
