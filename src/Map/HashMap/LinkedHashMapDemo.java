package Map.HashMap;



import java.util.HashMap;
import java.util.Iterator;
import java.util.*;


/**
 * Created by online on 15-1-17.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();

        lhm.put(3,"xiaoqiang");
        lhm.put(7,"wawngcai");
        lhm.put(5,"hehe");
        lhm.put(1,"heihei");


//        Iterator<Map.Entry<Integer,String>> it = lhm.entrySet().iterator();
        Set<Map.Entry<Integer,String>> met = lhm.entrySet();
        Iterator<Map.Entry<Integer,String>> it = met.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> me = it.next();
            Integer key  = me.getKey();
            String values = me.getValue();
            System.out.println(key+":"+values);
        }

    }
}
