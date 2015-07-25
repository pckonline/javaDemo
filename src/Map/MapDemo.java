package Map;

import java.util.*;

/**
 * Created by online on 15-1-16.
 *
 * Map:依次添加一对元素。Collection：一次添加一个元素。
 *      Map也称为双列集合，Collection集合称为单列集合。
 *      其实map集合存储的就是键值对
 *      map集合中必须保证键的唯一性
 *
 * 常用方法：
 * 1.添加
 *      value put(key,value):返回前一个和key关联的值，如果没有返回空。
 *
 * 2.删除
 *
 *      void clear()清空集合
 *      value remove(key),根据指定的key翻出这个键值对
 *
 * 3.判断
 *      boolean containsKey(key);
 *      boolean containsValue(value);
 *      isEmpty();
 * 4.获取
 *
 *      value get(key)  通过键获取，如果没有键  返回null
 *                      可以通过返回为null，来判断是否包含指定键。
 *      int size() 获取键值的个数
 *
 *
 * Map 常用的子类：
 *      --Hashtable:内部结构是哈希表，是同步的，不允许null作为键，不允许null作为值
 *            --Properties:用来存储键值对型的配置文件的信息，可以和IO技术相结合
 *      --HashMap：内部结构是哈希表，不是同步的，允许null作为键，允许null作为值
 *      --TreeMap：内部结构是二叉树，不是同步的，可以对Map集合中的键进行排序
 *
 */
public class MapDemo {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<Integer, String>();
//        method(map);
        menthod2(map);
    }
    public static void menthod2(Map<Integer,String> map){
        map.put(8,"wangwu");
        map.put(2,"zhaozhao");
        map.put(6,"lizi");
        map.put(9, "wangliu");

        Collection<String>coll = map.values();

        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
/*
通过Map转成Set就可以迭代，
找到另一个方法。entrySet。
该方法将键和值的映射关系作为对象存储到了Set集合中，而这个映射关系的类型就是Map.Entry类型（结婚证）
 */

//        Set<Map.Entry<Integer,String>> entrtSet = map.entrySet();
//
//        Iterator<Map.Entry<Integer,String>> it = entrtSet.iterator();

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> map3 = it.next();
            Integer key = map3.getKey();
            String value= map3.getValue();
            System.out.println(key+"::"+value);
        }





        //取出map中的所有元素。
        //原理，通过keySet方法获取map中所有的键所在的set集合，再通过set的迭代器获取到每一个键
        //再对每一个键通过map集合的get方法获取对应的值即可。
//        Set<Integer> keyset = map.keySet();
//            Iterator<Integer> it = keyset.iterator();
//            while (it.hasNext()){
//                Integer in = it.next();
//            String s = map.get(in);
//            System.out.println(s);
//        }
    }
    public static void method(Map<Integer,String> map){//学号和姓名
        //添加元素
        System.out.println(map.put(8,"haha"));//null
        System.out.println(map.put(8,"xiaoqiang"));//haha,存相同键，值会覆盖。
        map.put(2, "wangcai");
        map.put(7,"heihei");


//        System.out.println("remove:"+map.remove(7));

        //判断
//        System.out.println("contains:"+map.containsKey(7));

//        获取
        System.out.println("get:"+map.get(7));

        System.out.println(map);

    }

}
