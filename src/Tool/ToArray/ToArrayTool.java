package Tool.ToArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by online on 15-1-18.
 */
public class ToArrayTool {
    public static void main(String [] args){
        /*
        集合转成数组？
        使用的就是Collection接口中的toArray方法。

        集合转成数组，可以对集合中的元素操作的方法进行限定。不允许对其进行增删。
         */
        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        /*
        toArray方法需要传入一个指定类型的数组，
        长度如何定义？
        如果长度小于size，那么方法会创建一个同类型并和size相同的数组
        如果长度大于size，那么该方法就会使用指定的数组存储指定的元素，其他位置存储为null

        所以建议，最后长度就指定为size
         */

        String[] s = list.toArray(new String[7]);

//        String[] s = new String[7];
//        list.toArray(s);
//        System.out.println(Arrays.toString(s));
        System.out.println(s[2]);
    }
}
