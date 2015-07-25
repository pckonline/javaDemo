package CollectionsFramework.LinkedHashSet.test;

import CollectionsFramework.HashSet.test.Person;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by online on 15-1-14.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args){

        HashSet has = new LinkedHashSet();
//有序 且唯一
        has.add(new Person("lisi1",21));
        has.add(new Person("lisi2",22));
        has.add(new Person("lisi6",24));
        has.add(new Person("lisi6",24));
        has.add(new Person("lisi9",29));

        Iterator it = has.iterator();
        while (it.hasNext()){
            Person p = (Person)it.next();
            System.out.println(p.getName()+"::"+p.getAge());
        }

    }
}
