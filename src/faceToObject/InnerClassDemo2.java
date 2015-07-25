package faceToObject;

import java.util.Objects;

/*
为什么内部类能直接访问外部类的成员呢？
那是因为内部类持有了外部类的引用。外部类名.this
 */
/*
class Outer
{
    int num = 3;
    class Inner
    {
        int num = 4;
        void show()
        {
            int num = 5;
            System.out.println(Outer.this.num);
        }
    }
    void method()
    {
        new Inner().show();
    }
}
*/
/*
内部类可以放在局部位置上

内部类在局部位置上只能访问局部中被final修饰局部变量。
 */
/*
class Outer
{
    int num =3;
    Object method(){
         final int x = 9;
        class Inner{
            void show(){
                System.out.println("haha  "+x);
            }
        }
        Object in = new Inner();
        //in.show();
        return  in;//0x0034
    }
}*/
/*
匿名内部类。就是内部类的简写格式。
前提：内部类必须继承或者实现一个外部类或者接口。
匿名内部类：其实就是一个匿名子类对象。
格式：new父类or接口(){}(子类内容)
 */
/*
abstract class Demo8
{
    abstract void show();
}
class Outer
{
    int num  = 4;
    class   Inner extends Demo8
    {
        void show()
        {
            System.out.println("hah");
        }
    }
    public void method()
    {
        // new Inner().show();
        new Demo8()
        {
            void show()
            {
                System.out.println("show.."+num);
            }
        }.show();
    }
}
*/
/*
通常使用的場景之一：
当函数参数是接口类型的时候，而且接口中的方法不超过三个，
可以用匿名内部类作为实际参数进行传递。
 */
/*
interface Demo8
{
    void show1();
    void show2();
}
class Outer
{
    class Inner implements Demo8
    {
        public void show1()
        {
            System.out.println("hei");
        }
        public void show2()
        {
            System.out.println("hehehe");
        }
    }
    public void method()
    {
        //Inner in = new Inner();
        //in.show1();
        //in.show2();
        Demo8 d = new Demo8()
        {
            public void show1()
            {

            }
            public void show2()
            {

            }
        };
        d.show1();
        d.show2();
    }
}
public class InnerClassDemo2
{
    public static void main(String[] args)
    {
        new Outer().method();
        /*
        show(new Demo8()
        {
            public void show1()
            {

            }
            public void show2()
            {

            }
        });

    }
    public static void show(Demo8 in)
    {
        in.show1();
        in.show2();
    }
}
*/
//面试题
class Outer{
    void method() {
        new Object()
        {
            public void show()
            {
                System.out.println("hehe");}
        }.show();//但是不能用Object o = new Object  {public void show()
        // {System.out.println("hehe");}}o.show(); 因为匿名内部类这个子类对象被向上转型为Object类型
        //这样就不能使用子类特有的方法了
    }
}
public class InnerClassDemo2
{
    public static void main(String[] args)
    {
        new Outer().method();
    }
}