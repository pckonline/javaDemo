package Tool;

import CollectionsFramework.TreeSet.net.ComparatorByLength;
import CollectionsFramework.TreeSet.net.ComparatorByName;
import sun.text.resources.et.CollationData_et;

import java.util.*;

/**
 * Created by online on 15-1-18.
 */
public class CollectionsDemo {
    public static void main(String[] args){
        /**
         *Collections:是集合框架的工具类
         * 里面的方法都是静态的
         *
         */
//        demo_1();

        demo_3();

    }

    private static void demo_3() {
        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));
        //按自然逆序排序
        ts.add("heihei");
        ts.add("anc");
        ts.add("wangcai");
        ts.add("haha");
        ts.add("heheh");

        System.out.println(ts);

    }

    public static void demo_1(){
        List<String> li = new ArrayList<String>();

        li.add("abc");
        li.add("cba");
        li.add("nbaa");
        li.add("zzz");
        li.add("zz");
        li.add("z");
        System.out.println(li);
//        Collections.sort(li,new ComparatorByLength());//按照比较器ComparatorByLength 比较
//        System.out.println(li);
        Collections.sort(li);
        System.out.println(Collections.binarySearch(li,"zz"));//二分查找
        //若未找到 返回插入点-1
        System.out.println(Collections.max(li,new ComparatorByLength()));
        //按照比较器进行比较取出最大值
    }
}
