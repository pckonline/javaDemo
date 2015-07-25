package CollectionsFramework.generic.p3.net;

import CollectionsFramework.generic.bean.Person;
import CollectionsFramework.generic.p2.net.Student;
import CollectionsFramework.generic.p2.net.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by online on 15-1-15.
 */
public class GenericAdvanceDemo2 {
    public static void main(String[] args){
        ArrayList<Worker> ar = new ArrayList<Worker>();
        ar.add(new Worker("akfh",34));
        ar.add(new Worker("gagr",24));


        ArrayList<Student> ar2 = new ArrayList<Student>();
        ar2.add(new Student("fafad",36));
        ar2.add(new Student("pyt",46));

        ArrayList<String> ar3 = new ArrayList<String>();
        ar3.add("fafad");
        ar3.add("pyt");

        printCpllection(ar);
        printCpllection(ar2);
//        printCpllection(ar3);//因为printCpllection里只接收Person的子类或者Person

    }
/*
迭代并打印集合元素

可以对类型进行限定：
? extends  E：接收E类型，或者E的子类型对象，上限。
？ super E：接收E类型，或者E的父类类型对象，下限。
 */
     private static void printCpllection(Collection<? extends Person> ar) {
         //这样可以接收Person的子类泛型
         //
        Iterator<? extends Person> it =  ar.iterator();
        while(it.hasNext()){
//            System.out.println(it.next().toString());
            Person p = it.next();
            System.out.println(p.getName());

        }
    }
}

