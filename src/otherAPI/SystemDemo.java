package otherAPI;

import java.util.Properties;
import java.util.Set;

/**
 * Created by online on 15-1-22.
 */
public class SystemDemo {
    public static void main(String[] args){
        /*
        System的方法和属性都是静态的

        常见方法：long currentTimeMillis();
         */
//        long l1 = System.currentTimeMillis();
//        System.out.println(l1);//获取当前的时间（ms）
    demo_1();
    }
    public static void demo_1(){
        //获取系统的属性信息，并存储到Properties集合中
        /*
        Properties集合中存储的都是String键和值
        最好用它自己的存储和取出来完成元素的操作

         */
        Properties prop  = System.getProperties();

        Set<String> se = prop.stringPropertyNames();
        for (String se1:se){
            String value = prop.getProperty(se1);
            System.out.println(se1+":"+value);
        }
    }
}
