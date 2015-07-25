package otherAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.SimpleTimeZone;

/**
 * Created by online on 15-1-22.
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        dateDemo_3();
    }

    /*
        将日期格式的字符串-->日期对象
    使用的是DateFormat类中的
     */
    public static void dateDemo_3() throws ParseException {
        String str_date = "2015---1---22";

        DateFormat df =DateFormat.getDateInstance(DateFormat.LONG);
        df = new SimpleDateFormat("yyyy---MM---dd");
        Date date = df.parse(str_date);
        System.out.println(date);//步骤，需要创建一个DateFormat对象，令其为DateFormat中的一种格式或者可以自定义格式
    }

    /*
    对日期对象进行格式化
    将日期对象装成日期格式的字符串
        使用的是DateFormat类中的format方法
     */
    public  static void dateDemo_2() {
        Date date = new Date();
////获取日期格式对象，具有默认的风格
//        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//        df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);

        //如何风格是自定义的呢？
        DateFormat df = new SimpleDateFormat("yyyy--MM--dd");
        String str_date  = df.format(date);
        System.out.println(str_date);
    }


    /*
      日期对象和毫秒值的转换
      毫秒值->日期对象
      1.通过Date对象的构造方法new Date(timeMillis)
      2.还可以同过setTime设置。
      因为可以通过Date对象的方法进行对该日期的各个字段（年，月，日）进行操作

      日期对象装成毫秒值

      1.getTime方法
      因为可以通过具体的数值进行运算
       */
    private static void dateDemo_1() {
        long time = System.currentTimeMillis();
//        System.out.println(time);//1421889840333

        Date date1 = new Date();//将当前日期和时间封装成Date对象
        System.out.println(date1);//Thu Jan 22 09:25:21 CST 2015

        Date date2 = new Date(1111111111);
        System.out.println(date2);
    }

}
