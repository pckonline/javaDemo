package Map.TreeMap;

import CollectionsFramework.generic.p2.net.Student;

import java.util.*;

/**
 * Created by online on 15-1-17.
 */
public class TreeMapDemo {
    public static void main(String[] args) {


        /*
        将学生对象和学生的归属地通过键值对存储到map集合中

         */

        TreeMap<Student, String> tm = new TreeMap<Student, String>();
        tm.put(new Student("lishi1", 38), "beijing");
        tm.put(new Student("lishi2", 58), "shanghai");
        tm.put(new Student("lishi4", 18), "guangzhou");
        tm.put(new Student("lishi3", 28), "qindao");
        tm.put(new Student("lishi3", 28), "qindao5");


//        Iterator <Map.Entry<Student,String>> it = tm.entrySet().iterator();

        Set<Map.Entry<Student, String>> set = tm.entrySet();
        Iterator<Map.Entry<Student, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Student, String> me = it.next();
            Student stu = me.getKey();
            String value = me.getValue();
            System.out.println(stu.getName() + ":" + stu.getAge() + ":" + value);
        }
    }
}
