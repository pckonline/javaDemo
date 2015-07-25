package CollectionsFramework.TreeSet.net;

import CollectionsFramework.HashSet.test.Person;

import java.util.*;

/**
 * Created by online on 15-1-14.
 *
 * TreeSet对元素进行排序的方式1：
 * 让元素具备比较功能，就需要实现Comparable 接口，并覆盖compareTo方法
 *
 * 如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。
 * 可以使用TreeSet集合的第二种排序方式：
 * 让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法
 * 将该接口的子类对象作为参数传递给TreeSet集合的构造函数
 *
 */
public class TreeSetDemo {
    public static void main(String[] args){
//        demo1();
        TreeSet t2 = new TreeSet(new ComparatorByName() );//定义一个类实现Comparator接口，覆盖compare方法
       // * 将该接口的子类对象作为参数传递给TreeSet集合的构造函数
        t2.add(new Person("张三5",14));
        t2.add(new Person("张三5",14));//这样当传入第二个的时候会自动和第一个比较（按照ComparatorByName定义的比较方法）
        t2.add(new Person("张三2",23));//Set集合不会加入相同的对象
        t2.add(new Person("张三3",22));
        t2.add(new Person("张三4",24));

        //如果比较age  由于每输入一个数即从第一个开始比较，类似于二叉比较树的建树过程

        Iterator it1 = t2.iterator();
        while (it1.hasNext()){
            Person p = (Person)it1.next();
            System.out.println(p.getName()+"::"+p.getAge());
            //            当添加的是对象时，需要对Person的比较进行复写  即implements Comparable

        }
    }

    private static void demo1() {
        TreeSet t1 = new TreeSet();
//TreeSet 可对Set集合进行指定顺序排序
        t1.add("abc");
        t1.add("aa");
        t1.add("nba");
        t1.add("cba");

        Iterator it1 = t1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());//按照元素的自然顺序;
        }
    }

}
