package faceToObject;

/*
封装：
封装的好处：
将变化隔离 ，便于使用，提高重用性 提高安全性
private,私有，是一个权限修饰符。用于修饰成员，私有成员只在本类有效
似有仅仅是封装的一种体现而已
 */
/*
构造函数：特点  函数名与类名相同   不需要返回值类型  没有具体的返回值
一般函数和构造函数的区别：
构造函数对象创建时就会调用与之对应的构造函数，对对象进行初始化
一般函数对象创建后需要该函数功能时才调用。

构造函数：对象创建时会只调用一次。
一般函数：对象创建后可被调用多次。

什么时候定义构造函数？
在描述事物时，该事物已经存在就具备的一些内容，这些内容都定义在构造函数中。
 */
/*

 */
class Person
{
    private String name;
    private int age;

    //定义一个Person类的构造函数
    Person()//构造函数，而且是空参数的
    {
        name = "baby";
        age = 1;
        System.out.println("HelloWorld.Person run");
    }
    Person(String n)
    {
        name = n;
        age = 3;
    }
    Person(String n,int m)
    {
        name = n;
        age = m;
    }
    public void setName(String n)//在初始化之后对其改变
    {
        name = n;
    }
    public void speak()
    {
        System.out.println(name+","+age);
    }
}
public class PersonDemo
{
    public static void main(String[] args)
    {
        Person p = new Person();
        Person p1 = new Person("black");
        Person p2 = new Person("小白",18);
        p2.setName("笑笑");  //对p2的name做改变 并可以改变多次
        p.speak();
        p1.speak();
        p2.speak();
        /*
        构造函数：构建创造对象时所调用的函数，作用：可以给对象进行初始化
        一个类中如果没有定义一个构造函数，那么该类中会有一个默认的空参数的构造函数
        如果在类中定义了制定的构造函数，那么类中的默认构造函数就没有了
        */
    }

}
