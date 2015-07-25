package CollectionsFramework.generic.p3.net;

import CollectionsFramework.generic.bean.Person;
import CollectionsFramework.generic.p2.net.Student;
import CollectionsFramework.generic.p2.net.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by online on 15-1-15.
 *
 * addAll
 */
public class GenericAdvanceDemo3 {
    public static void main(String[] args){
        ArrayList<Person> ar1 = new ArrayList<Person>();
        ar1.add(new Person("akfh",34));
        ar1.add(new Person("gagr",24));

        ArrayList<Student> ar2 = new ArrayList<Student>();
        ar2.add(new Student("fafad",36));
        ar2.add(new Student("pyt",46));

        ArrayList<Worker> ar3 = new ArrayList<Worker>();
        ar3.add(new Worker("akfh",34));
        ar3.add(new Worker("gagr",24));

        ArrayList<String> ar4 = new ArrayList<String>();
        ar4.add("adfg");
//        ar1.addAll(ar4);//错误，类型不匹配。

        System.out.println(ar1);
        ar1.addAll(ar2);
        System.out.println(ar1);
//        printCpllection(ar);
//        printCpllection(ar2);
//        printCpllection(ar3);//因为printCpllection里只接收Person的子类或者Person

    }
    /*
    一般在存储元素的时候都是上限。因为这样去取出都是按上限类型来运算的。不会出现类型安全隐患。


     */


}

