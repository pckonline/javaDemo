package CollectionsFramework.TreeSet.net;

import java.util.Comparator;

/**
 * Created by online on 15-1-15.
 */
public class ComparatorByLength implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;

        int temp= s1.length()-s2.length();
        return temp==0?s1.compareTo(s2):temp;
    }
}
