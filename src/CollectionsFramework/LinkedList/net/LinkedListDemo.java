package CollectionsFramework.LinkedList.net;

import java.util.LinkedList;

/**
 * Created by online on 15-1-15.
 *
 * LinkedList集合中有类似于栈和队列的方法  先进先出  和先进后出
 */
public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList li1 = new LinkedList();
        li1.push("abc1");
        li1.push("abc2");
        li1.push("abc3");
        li1.push("abc4");

        System.out.println(li1);
        while(!li1.isEmpty()){
            System.out.println(
                    li1.pop()//先进后出
                );
        }
    }
}
