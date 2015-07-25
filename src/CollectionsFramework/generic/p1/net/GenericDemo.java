package CollectionsFramework.generic.p1.net;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by online on 15-1-15.
 *
 * 泛型：
 *      JDK1.5出现的安全机制。
 * 好处：
 *      1.将运行时期的问题ClassCastException转到了编译时期
 *      2.避免了强制转换的麻烦
 *
 * <>：什么时候用？ 当操作的数据类型不确定的时候。就使用<>。将要操作的引用数据类型传入即可。
 * 其实<>就是一个用于接收具体引用数据类型的参数范围。
 *
 * 在程序中,只要用到了带有<>的类或者接口，就要明确传入的具体引用数据类型。
 *
 * 泛型技术是给编译器使用的技术，用于编译时期。确保了类型的安全。
 *
 * 运行时，会将泛型去掉，生成的class文件是不带泛型的，这个称为泛型的擦除
 *
 * 为什么擦除？因为为了兼容运行的类加载器。
 *
 * 泛型的补偿：在运行时，通过获取元素的类型进行转换动作。不用使用者进行强制转换了。
 *
 * 泛型的通配符：？未知类型
 *
 */
public class GenericDemo {
    public static void main(String[] args){
        ArrayList<String> a1 = new ArrayList<String>();//尖括号里放什么类型，使用a1的方法时候不能使用其他的类型

        a1.add("abc");//public boolean add(Object obj)
        a1.add("haha");
//        a1.add(4);//a1.add(Integer(4));

        Iterator<String> it1 = a1.iterator();
        while (it1.hasNext()){
            String s = it1.next();//使用泛型以后即不需要进行强行转型了
            System.out.println(s);
        }
    }
}
