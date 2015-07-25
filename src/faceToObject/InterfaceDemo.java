package faceToObject;

/*
当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类
用另一种形式定义和表示，就是 接口 interface

定义的接口使用的关键字不是class  而是interface
对于接口当中常见的成员：而且这些成员都有固定的修饰符。
1.全局常量。public static final
2.抽象方法。public abstract
由此得出结论，接口中的成员都是公共的权限
 */
interface Face
{
    public static final int num = 4;
    public abstract void show1();
    public abstract void show2();
}
//类与类之间是继承关系，类与接口之间是实现关系
/*接口不可以实例化。
只能由实现了接口的子类并覆盖接口中哦所有的抽象方法，该子类才可以实例化。
否则这个子类就是一个抽象类
 */
class Face1 implements /*实现*/ Face
{
    public void show1()
    {
        System.out.println("haha");
    }
    public void show2()
    {
        System.out.println("hehe");
    }
}
/*
在java中不直接支持多继承，因为会出现调用的不确定性。
所以java将多继承机制进行改良，在java中变成了多实现

一个类可以实现多个接口。
 */
interface A
{
    public abstract void show();
}
interface Z
{
    public abstract void show();
}
class B implements A,Z
{
    public void show()
    {
        System.out.println("haha");
    }
}
/*
一个类在继承另一个类的同时，还可以实现多个接口。
 */
class Q
{
    public void method()
    {
        System.out.println("haha");
    }
}
class Test extends Q implements A,Z
{
    public void show()
    {
        System.out.println("hehe");
    }
}
/*
接口的出现避免了单继承的局限性。
 */

/*

 */
interface  GG
{
    public abstract void show();
}
interface MM
{
    public abstract void method();
}
interface QQ extends GG,MM //接口和接口之间是继承关系，而且接口可以多继承
{
    public abstract void fun();
}
class CC implements QQ
{
    //需要覆盖3该方法
    public void show(){}
    public void method(){}
    public void fun(){}
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Test f = new Test();
        f.show();
        f.method();
    }

}
