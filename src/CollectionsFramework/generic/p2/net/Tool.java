package CollectionsFramework.generic.p2.net;

import CollectionsFramework.generic.bean.Person;

/**
 * Created by online on 15-1-15.
 */
//class Tool {
//    private Object object;
//
//    public Object getObject() {
//        return object;
//    }
//
//    public void setObject(Object object) {
//        this.object = object;
//    }
//}
//在JDK1.5以后，使用泛型来接收类中要操作的数据类型

    //泛型类什么时候用？类中操作的引用数据类型不确定时，就使用泛型来表示
public class  Tool<QQ>{
    private QQ q;

    public QQ getObject() {
        return q;
    }

    public void setObject(QQ object) {
        this.q = object;
    }

    //将泛型定义在方法上
    public<W> void show(W str){
        System.out.println("show :"+str.toString());

    }
    public void print(QQ str){
        System.out.println("print :"+str);
    }
//  当方法静态时，不能访问类上定义的泛型，如果静态想使用泛型
//  必须要把泛型定义在方法上
    public static<R> void method(R obj){
        System.out.println("method:"+obj.toString());
    }
}
