package CollectionsFramework.generic.p3.net;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by online on 15-1-15.
 */
public class GenericAdvanceDemo {
    public static void main(String[] args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("abc1");
        ar.add("abc2");


        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        ar2.add(5);
        ar2.add(7);

        printCpllection(ar);
        printCpllection(ar2);

    }
/*
迭代并打印集合元素
 */
    private static void printCpllection(Collection<?> ar) {
        Iterator<?> it =  ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}
