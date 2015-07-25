package faceToObject;

/*
内部类:
内部类访问特点：
1.内部类可以直接访问外部类中的成员。
2.外部类要访问内部内，必须建立内部类的对象

什么时候用？
一般用于类的设计
分析事物时，发现事物描述中还有事物，而且这个事物还在访问被描述的事物的内容。
这时就是还有事物的定义成内部类来描述
 */
/*
class Outer
{
    private static int num = 3;
    static class Inner//内部类
    {
         void show()
        {
            System.out.println("haha  "+num);
        }
        //如果在内部类中定义了静态成员，该内部类也应该是静态的
        static void display()
        {
            System.out.println("run....");
        }
    }
    public void method()
    {
        Inner in = new Inner();
        in.show();
    }
}
public class InnerClassDemo
{
    public static void main(String[] args)
    {
        //Outer o = new Outer();
       // o.method();
        //直接访问外部类中的内部类的成员
        //Outer.Inner in = new Outer().new Inner();//固定格式
        //in.show();
        //如果内部类是静态的，相当于一个外部类。
        //Outer.Inner in = new Outer.Inner();
        // in.show();
        //如果内部类是静态的，成员也是静态的。
        //Outer.Inner.display();
    }
}
*/