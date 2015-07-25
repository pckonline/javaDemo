package CollectionsFramework.generic.p1.net;


import CollectionsFramework.generic.bean.Person;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by online on 15-1-15.
 */
public class GenericDemo2 {
    public static void main(String[] args){
        TreeSet<Person> ts = new TreeSet<Person>();
        ts.add(new Person("lisi",20));
        ts.add(new Person("lisi",22));
        ts.add(new Person("zhangsan",23));
        ts.add(new Person("wuwang",22));
        ts.add(new Person("zhaozhao",28));


        Iterator<Person> it1 = ts.iterator();
        while (it1.hasNext()){
            Person p = it1.next();
            System.out.println(p.getName()+":"+p.getAge());
        }

    }
}
