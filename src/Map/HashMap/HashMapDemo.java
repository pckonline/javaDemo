package Map.HashMap;

import CollectionsFramework.generic.p2.net.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/**
 * Created by online on 15-1-17.
 */
public class HashMapDemo {
    public static void main(String[] args){


        /*
        将学生对象和学生的归属地通过键值对存储到map集合中

         */

        HashMap<Student,String> hm = new HashMap<Student, String>();
        hm.put(new Student("lishi1",38),"beijing");
        hm.put(new Student("lishi2",58),"shanghai");
        hm.put(new Student("lishi4",18),"guangzhou");
        hm.put(new Student("lishi3",28),"qindao");
        hm.put(new Student("lishi3",28),"qindao5");

        Set<Student> set = hm.keySet();
        Iterator<Student> it  = set.iterator();
        while(it.hasNext()){
            Student key = it.next();
            String value = hm.get(key);
            System.out.println(key.getName()+":"+key.getAge()+":"+ value);
        }

    }
}
