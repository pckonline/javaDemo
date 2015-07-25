package CollectionsFramework.HashSet.test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by online on 15-1-14.
 *
 * 哈希表确定元素是否相同
 *      1.判断的是两个元素的哈希值是否相同，
 *          如果相同，再判断两个对象的内容是否相同;
 *      2.判断哈希值相同，其实就是判断对象的hashCode的方法，
 *      判断内容相同，用的是equals方法。
 * 注意：如果哈希值不同，不需要判断equals
 *
 * 往hashSet集合中存储对象，如果姓名和年龄相同，视为相同元素
 */
public class HashSetTest {
    public static void main(String[] args){

        /*
        * HashSet 集合数据结构是哈希表，所以存储元素的时候
        * 使用的元素的hashCode方法来确定位置，如果位置相同，通过元素的equals来确定是否相同。
        *
        *
        * */
        HashSet has = new HashSet();

        has.add(new Person("lisi1",21));
        has.add(new Person("lisi2",22));
        has.add(new Person("lisi6",24));
        has.add(new Person("lisi6",24));
        has.add(new Person("lisi9",29));
        System.out.println(
                has
        );//无序的输出。
        Iterator it = has.iterator();
        while (it.hasNext()){
            Person p = (Person)it.next();
            System.out.println(p.getName()+"::"+p.getAge());
            //只有复写equals方法时，才能保证存入的不重复 即extend Object
        }

    }
}