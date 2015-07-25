package CollectionsFramework.generic.p3.net;

import CollectionsFramework.generic.bean.Person;
import CollectionsFramework.generic.p2.net.Student;
import CollectionsFramework.generic.p2.net.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by online on 15-1-15.
 *
 * addAll
 *
 * 集合的一些技巧：
 * 需要唯一么？
 * 需要：Set
 *      需要指定顺序么？
 *      TreeSet
 *      不需要：
 *      HashSet
 *
 *      但是想要一个和存储顺序一致的的顺序（有序）：LinkedHashSet
 *
 * 不需要：List
 *
 *      需要频繁增删么？
 *      需要：LinkedList
 *      不需要：ArrayListDemo2
 *
 * 如何记录每一个容器的结构和所属体系呢？
 * 看名字
 *
 * 后缀名就是该集合的所属体系。
 *
 * 前缀名就是该集合的数据结构。
 *
 * 看到Array就要想到数组，查询快，有脚标
 *
 * 看到Linked 就要想到链表，增删快，就要想到，add get  remove+first last方法
 *
 * 看到Hash  就要想到哈希表，就要想到唯一性，就要想到覆盖hashCode和equals方法，
 *
 * 看到Tree  就要想到二叉树，就要想到排序，就要想到Comparator，Comparable
 *
 * 而且通常这些常用的集合容器都是不同步的
 */
public class GenericAdvanceDemo5 {
    public static void main(String[] args) {
        ArrayList<Person> ar1 = new ArrayList<Person>();
        ar1.add(new Person("abc1", 34));
        ar1.add(new Person("abc3", 34));
        ar1.add(new Person("abc2", 24));


        ArrayList<Person> ar2 = new ArrayList<Person>();
        ar2.add(new Person("abc111", 34));
        ar2.add(new Person("abc3333", 34));
        ar2.add(new Person("abc2222", 24));

        ArrayList<String> ar4 = new ArrayList<String>();
        ar4.add("adfg");

        printCpllection(ar2);
//        ar1.contains(ar4);
//        Iterator<HelloWorld.Person> it = ar1.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }

    public static void printCpllection(Collection<?> ar) {
        Iterator<?> it = ar.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}