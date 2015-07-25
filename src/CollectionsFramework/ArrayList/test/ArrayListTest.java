package CollectionsFramework.ArrayList.test;

import CollectionsFramework.HashSet.test.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by online on 15-1-14.
 */
public class ArrayListTest {

    public static void main(String[] args){
        ArrayList has = new ArrayList();
        has.add(new Person("lisi1",21));
        has.add(new Person("lisi2",22));
        has.add(new Person("lisi6",24));
        has.add(new Person("lisi6",24));
        has.add(new Person("lisi9",29));
        System.out.println(has);

        has = getSingleElement(has);
        System.out.println(has);
    }
    public static ArrayList getSingleElement(ArrayList arr1){
        //1.定义一个临时容器
        ArrayList a2 = new ArrayList();

        //迭代a1集合。
        Iterator it1 = arr1.iterator();
        while (it1.hasNext()){

            Object obj = it1.next();
            //判断被迭代的元素是否在临时容器中
            if(!a2.contains(obj)){
                a2.add(obj);
            }
        }

        return a2;
    }
}
