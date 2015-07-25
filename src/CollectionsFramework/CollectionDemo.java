package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by online on 15-1-6.
 */
/*
集合类的由来
    对象用于封装特有数据，对象多了需要存储，如果对象的个数不确定。
    就使用集合容器进行存储

集合特点：
1.用于存储对象的容器
2.集合的长度是可变的
3.集合中不可存储基本数据类型值

集合容器因为内部的数据结构不同，有多种具体容器。
不断的向上抽取，就形成了集合框架

框架的顶层Collection接口

Collection的常见方法：
1.添加
    boolean add(Object obj)
    boolean addAll(Collection coll)

2.删除
    boolean remove(Object obj)
    boolean removeAll(Collection coll)
    void clear();

3.判断：
    boolean contains(Object obj)
    boolean containsAll(Collection coll)
    boolean isEmpty();判断集合是否为空

4.获取
    int size();
    Iterator iterator();取出元素的方式;迭代器

5.其他：
    boolean retainAll(Collection coll);取交集
    Object[] toArray(); 将集合转成数组。
 */
public class CollectionDemo {
    public static void main(String[] args)
    {
        Collection coll =  new ArrayList();
        //show(coll);

        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        show1(c1,c2);
    }
    public static void show1(Collection c1,Collection c2)
    {
        //给c1添加元素
        c1.add("abc1");
        c1.add("abc2");
        c1.add("abc3");
        c1.add("abc4");

        //给c2添加元素
        c2.add("abc2");
        c2.add("abc6");
        c2.add("abc7");

        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        //演示addAll()
        //c1.addAll(c2);//将c2中的元素添加到c1
        //System.out.println("c1 = "+c1);

        //演示removeAll
//        boolean b = c1.removeAll(c2);
//        System.out.println("removeAll:"+b);// 将两个集合中的相同元素从调用removeAll的集合中删除

        //演示containsAll
//        boolean b = c1.containsAll(c2);
//        System.out.println("containsAll:"+b);

        //演示retainAll    (取交集，保留和指定的集合相同的元素，而删除不同的元素。和remove相反)
        boolean b = c1.retainAll(c2);

        System.out.println("c1:"+c1);
    }
    public static void show(Collection coll)
    {
        //1.添加元素。 add
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");

        //删除元素 。 remove
        coll.remove("abc2");//会改变集合的长度
        //清空集合 clear

        //是否含有元素
        System.out.println(coll.contains("abc3"));
        System.out.println(coll);
        //
    }
}
