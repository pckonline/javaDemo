package CollectionsFramework.generic.p3.net;

import CollectionsFramework.generic.bean.Person;
import CollectionsFramework.generic.p2.net.Student;
import CollectionsFramework.generic.p2.net.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by online on 15-1-15.
 *
 * addAll
 */
public class GenericAdvanceDemo4 {
    public static void main(String[] args){
        TreeSet<Person> ar1 = new TreeSet<Person>(new ComparatorByName());
        ar1.add(new Person("abc1",34));
        ar1.add(new Person("abc3",34));
        ar1.add(new Person("abc2",24));

        TreeSet<Student> ar2 = new TreeSet<Student>(new ComparatorByName());
        //Student 使用new ComparatorByName() 意思就是可以按照存入Srudent 取出时用Person

        ar2.add(new Student("abc4",36));
        ar2.add(new Student("abc5",46));

        TreeSet<Worker> ar3 = new TreeSet<Worker>(new ComparatorByName());
        ar3.add(new Worker("abc8",34));
        ar3.add(new Worker("abc7",24));

        TreeSet<String> ar4 = new TreeSet<String>();
        ar4.add("adfg");

        ar1.addAll(ar3);
        ar1.addAll(ar2);

        Iterator<Student> it = ar2.iterator();//取出谁这里尖括号内就是谁，也是用谁的迭代器
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

/*
class TreeSet<E>
{
    Tree(Comparator1<? super E> comp);
}
什么时候使用下限呢？通常对集合中的元素进行取出操作时，可以使用下限
 */
class ComparatorByName implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
                int temp= o1.getName().compareTo(o2.getName());
        return temp==0?o1.getAge()-o2.getAge():temp;
    }
}

