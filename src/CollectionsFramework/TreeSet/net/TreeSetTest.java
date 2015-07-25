package CollectionsFramework.TreeSet.net;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by online on 15-1-15.
 */
public  class TreeSetTest {
    public static void main(String[] args){
        TreeSet ts=new TreeSet(new ComparatorByLength());

        ts.add("zz");
        ts.add("zz");
        ts.add("abc");
        ts.add("cba");
        ts.add("nbaq");


        Iterator it1 = ts.iterator();
        while (it1.hasNext())
        {
            String s = (String) it1.next();
            System.out.println(s);
        }
    }
}
