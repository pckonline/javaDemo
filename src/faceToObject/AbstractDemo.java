package faceToObject;

/*
抽象类：
抽象：笼统 模糊，看不懂！不具体。

特点：
1.方法只有声明没有实验时，该方法就是抽象方法，需要被abstract修饰。
抽象方法必须定义在抽象类中，该类必须也被abstract修饰。
2.抽象类不可以被实例化。不可以被new  why？因为调用抽象方法没意义。
3.抽象类必须由其子类覆盖其所有的抽象方法后，该子类才可以实例化
否则，这个子类还是抽象类。

1.抽象类中有构造函数么？
有，用于给子类构造函数初始化。
2.抽象类可以不定义抽象方法么？
可以，但是很少见，目的就是不让该类创建对象。AWT的适配器对象就是这种类。
    通常这个类中的方法有方法体，但是没有内容
3.抽象关键字不可以和哪些关键字共存？
private 不行
static 不行
final 不行
4.抽象类和一般类的异同点。

相同点：抽象类和一般类都是用来描述事物的，都在内部定义了成员。
不同：1.一般类有足够的信息描述事物。
抽象类描述事物的信息可能不足。
2.一般类中不能定义抽象方法，只能定义非抽象方法
抽象类中可定义抽象方法，同时也可以定义非抽象方法
3.一般类可以被实例化，抽象类不可以。

5.抽象类一定是父类么？
是的。
因为需要子类覆盖其方法后才可以对子类实例化。

 */
abstract class Demo
{
     abstract void show();
}
class DemoA extends Demo
{
    void show()
    {
        System.out.println("demo show");
    }
}
class DemoB extends Demo
{
    void show()
    {
        System.out.println("demob show");
    }
}
public class AbstractDemo
{
    public static void main(String[] args)
    {
        DemoA d1= new DemoA();
        d1.show();
    }
}
