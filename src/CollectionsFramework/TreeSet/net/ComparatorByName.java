package CollectionsFramework.TreeSet.net;

import CollectionsFramework.HashSet.test.Person;

import java.util.Comparator;

/**
 * Created by online on 15-1-15.
 *
 * 创建一个根据Person类的name进行排序的比较器
 */
public class ComparatorByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Person p1 =(Person)o1;
        Person p2 =(Person)o2;

        int temp= p1.getName().compareTo(p2.getName());
        return temp==0?p1.getAge()-p2.getAge():temp;
//
//        return -1;//逆序输入  最后输入的放在第一位
//        int temp = p1.getAge()-p2.getAge();
//        return temp==0?p1.getName().compareTo(p2.getName()):temp;
    }
}
