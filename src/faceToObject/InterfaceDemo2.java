package faceToObject;

/*
抽象类和接口的异同：
相同点：
    都是不断向上抽取而来的。
不同点：
    1.抽象类需要被继承，而且只能单继承
    接口需要被实现。而且可以多继承。
    2.抽象类中可以定义抽象方法和非抽象方法。子类继承后可以直接使用非抽象方法。
    接口中只能定义抽象方法，必须由子类实现。
    3.抽象类的继承是 is a关系。在定义该体系的基本共性内容。
    接口的实现是 like a 关系。在定义体系的额外功能。

犬按功能分：有导盲犬，搜爆犬。

abstract class 犬
{
    abstract void 吼叫();
}
interface  导盲
{
    public void 导盲()
    {

    }
}
class 导盲犬 extends 犬 implements 导盲
{
    public void 吼叫()
    {

    }
    public void 导盲()
    {

    }
}

在不同的领域中，有不同的分析方式
 */
/*
笔记本电脑的使用。
为了扩展笔记本的功能，但是日后出现什么设备不知道。

定义一个规则，只要日后出现的设备都符合这个规则就可以类。
规则在java中就是接口

 */
interface USB
{
    public void open();
    public abstract void close();
}
public class InterfaceDemo2
{
    public static void main(String[] args)
    {
        useUSB(new UPan());//功能拓展//调用useUSB函数  形参是对象 在这里new一个对象
        //运用了多态，USB u =new Upan。成员函数： 编译时看左边，运行时看右边。
        //成员变量：编译和运行时都看左边。静态函数：都看左边
        useUSB(new UsbMouse());
    }

    //使用规则
    public static void useUSB(USB u)//接口类型的引用，用于接收（指向）接口的子类对象
    {
        u.open();
        u.close();
    }
}
//一年后。
//实现规则

//这些设备和电脑的耦合性就降低了。
class UPan implements USB
{
    public void open()
    {
        System.out.println("hah");
    }
    public void close()
    {
        System.out.println("hehe");
    }
}
class UsbMouse implements USB
{
    public void open()
    {
        System.out.println("haah");
    }
    public void close()
    {
        System.out.println("heehe");
    }
}
