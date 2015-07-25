package CollectionsFramework.generic.p2.net;

/**
 * Created by online on 15-1-15.
 */
public class GenericDefineDemo3 {
    public static void main(String[] args){
        InterfaceIn in1 = new InterfaceIn();
        in1.show("abc");

        InterfaceIn2<Integer> in2 = new InterfaceIn2<Integer>();
        in2.show(9);
    }
}
//泛型接口，将泛型定义在接口上。
interface Inter<T>{
    public void show(T t);
}


class InterfaceIn2<Q> implements Inter<Q>{
     public void show(Q q){
         System.out.println("2: "+q);
     }
}









class InterfaceIn implements Inter<String>{
    public void show(String str){

        System.out.println("show :"+str.toString());
    }

}
