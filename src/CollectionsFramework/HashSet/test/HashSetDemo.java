package CollectionsFramework.HashSet.test;

import java.util.HashSet;

/**
 * Created by online on 15-1-17.
 */
public class HashSetDemo {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add("zz");
        hs.add("zz");
        hs.add("zz");
        hs.add("zz");
        hs.add("zz");
        System.out.println(hs);//Set集合如果不覆写equals   不会存入相同的值
    }
}
