package HelloWorld;

import faceToObject.ADemo;//import 导入faceToObject中的类 但是不导入faceToObject中的包
//导包原则：用到那个类，就导入那个类

/*
    JAVA 入门
    输出一个数
 */
class BDemo extends ADemo
{
    public void method()
    {
        System.out.println("run");
    }
    public void show()
    {
        System.out.println("hahah");
    }
}
public class A
{
    public static void main(String[]agrs)
    {
        BDemo b = new BDemo();
        b.method();
        b.show();
        System.out.println("khk");
    }
}
/*
包与包之间的类型进行，被访问的包中的类必须是public的，被访问的类的方法也必须是public的

            public         protected        default        private
 同一类中      ok              ok              ok              ok
 同一包中      ok              ok              ok
 子类中        ok              ok
 不同包中       ok
 */
