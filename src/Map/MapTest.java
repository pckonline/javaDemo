package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by online on 15-1-17.
 * 练习：
 * “gsadgasdfasereag”获取该字符串中，每一个字符出现的次数
 * 结果打印的是a(4)b()...
 *
 * 对于结果的分析发现，字母和次数存在着映射关系，而且这种关系很多。
 * 很多就需要存储，能存储映射关系的容器有数组和Map集合
 * 关系一方是有序编号么？没有
 * 那就使用Map集合。又发现，可以保证唯一性的一方具备着顺序
 * 就是使用TreeMap集合
 *
 * 因为操作的是字符串中的字母，所以先将字符串变成字符数组。
 * 遍历字符数组，用每一个键作为键去查Map集合这个表
 *
 * 如果该字母键不存在，就将该字母作为键1作为值存储到这个集合中
 * 如果该字母键存在，就将该字母键对应的值取出并+1,将该字母和+1后的值存储到map集合中，
 * 键相同就覆盖，这样就记录了字母的次数，
 * 3.遍历结束，Map集合就记录了所有字母出现的次数
 */
public class MapTest {
    public static void main(String[] args){

       String str = "gsadgasdfasereag";
       String s = getCharCount(str);
        System.out.println(s);
    }

    private static String getCharCount(String str) {
        //将字符串变成字符数组

        char[] chs = str.toCharArray();

        //定义map集合表
        Map<Character,Integer> map = new TreeMap<Character,Integer>();

        for (int i = 0; i < chs.length; i++) {
            Integer value = map.get(chs[i]);
            int count = 0;

            if(value!=null){
                count = value;
            }
             count++;
            map.put(chs[i],count);
//            if(value==null)
//            {
//                map.put(chs[i],1);
//            }
//            else map.put(chs[i],value+1);


        }
        return mapToString(map);
    }

    private static String mapToString(Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = map.keySet().iterator();
        while(it.hasNext()){
            Character cs = it.next();
            Integer values = map.get(cs);
            sb.append(cs+"("+values+")");

        }


        return sb.toString();
    }

}
