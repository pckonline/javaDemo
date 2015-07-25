package faceToObject;

/**
 * Created by online on 14-10-29.
 */
/*
设计模式：对问题行之有效的解决方式，其实他是一种思想。

1.单例设计模式
解决的问题，可以保证一个类在内存中对象唯一性
必须对于多个程序使用同一个配置信息对象时，就需要保证该对象的唯一性。
如何保证唯一性？
1.不允许其他程序用new创建该类对象
2.在该类中创建一个本类实例
3.对外提供一个方法让其他程序可以获取对象。
步骤
1.私有化该类的构造函数
2.通过new在本类中创建一个本类对象
3.定义一个共有的方法，将创建的对象返回。
 */
    /*
class Single
{
    private static Single s = new Single();
    private Single(){}
    public static Single getInstance()
    {
        return s;
    }
}
*/
    //饿汉式
class Single//类一加载，对象就已经存在了
{
    private static Single s=new Single();
    private Single(){};
    public static Single getInstance()
    {
        return s;
    }
    int num;
    public void getTest(int n)
    {
           num=n;
    }
    public void showTest()
    {
        System.out.println(num);
    }
}
//懒汉式
class Single2//类加载进来，没有对象，只有调用了getInstance方法时，才会创建对象。
             //延迟加载形式。
{
    private static Single2 s=null;
    private Single2(){};
    public static Single2 getInstance()
    {
        if(s==null)
        s=new Single2();
        return s;
    }
}
public class SingleDemo
{
    public static void main(String[] args)
    {
        Single s1=Single.getInstance();
        Single s2=Single.getInstance();
        s1.getTest(10);
        s2.getTest(20);
        s1.showTest();//输出20  因为对象在内存的唯一性，s2赋值20的时候同时把s1的num的值改为20
        s2.showTest();
    }

}
