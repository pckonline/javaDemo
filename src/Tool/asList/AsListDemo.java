package Tool.asList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by online on 15-1-18.
 *
 * 重点：List asList(数组)将数组转成集合。
 *
 * 好处：  其实就是可以使用集合的方法操作数组中的元素
 * 注意：数组的长度是固定的，所有对于集合的增删方法是不可以使用的，
 * 否则发生错误
 */
public class AsListDemo {
    public static void main(String[] args) {
//        String[] s ={"haha", "xixi", "hehe"};
//        List<String> list = Arrays.asList(s);
//        System.out.println(list);
//        boolean b = list.contains("xixi");
//        System.out.println(b);
        method_1();
    }

    /*
    如果数组中的是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行存储。

    如果是基本数据类型数值，那么会将该数组作为集合中的元素进行存储。
     */
    public static void method_1() {
        int[] a = {1, 2, 5, 3, 6, 9, 8};
        List list = Arrays.asList(a);
    }
}
