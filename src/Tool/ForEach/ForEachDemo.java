package Tool.ForEach;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by online on 15-1-18.
 */
public class ForEachDemo {
    public static void main(String[] args){
        /*
        forEach语句：
        格式：
        forEach(类型 变量:Collection 集合|数组)
        {

        }

        传统for  和增强for的区别？
        传统for可以完成对语句执行很多次，因为它可以定义控制循环增量的条件;
        而高级for是一种简化形式。
        它必须有被遍历的目标。该目标要么是数组，要么是Collection单列集合

        对数组的遍历如果是仅仅的获取数组中的元素，可以使用高级for，简单;
        如果要对数组的脚标元素进行操作，建议使用传统for
         */

        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

        for(String s :list){//简化书写，类似于Iterator
            System.out.println(s);
        }

        int[] ar = {1,2,5,7,3,4};
        for(int i :ar){
            System.out.println(i);
        }
    }
}
