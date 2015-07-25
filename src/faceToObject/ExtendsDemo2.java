package faceToObject;

import javax.xml.soap.SOAPPart;

/*
在子父类中，成员的特点体现
1.成员变量
2.成员函数
3.构造函数
 */
/*
当本类的成员和局部变量同名用this区分
当子父类成员变量同名用super区分父类。
this和super用法很相似
this:代表一个本类对象的引用。
super： 代表父类的空间。
 */
/*
class Fu
{
     int num =4;
}
class Zi extends Fu
{
    private int num = 5;//子类不能直接访问父类中的私有内容
    void show()
    {
        System.out.println(num+"...."+super.num);
    }
}

public class ExtendsDemo2
{
    public static void main(String[] args)
    {
        Zi z = new Zi();
        z.show();
    }
}
*/
//成员函数
/*
当子父类中出现的成员函数一模一样的情况，会运行子类的函数。
这种现象成为覆盖操作。这是函数在子父类中的特性。
函数两个特性：1.重载：同一个类中。2.覆盖：子类中，覆盖也成为重写，覆写，override。
重点：覆盖的注意事项
1.子类方法覆盖父类方法的时候，子类权限必须要大于等于父类的权限。
2.静态函数只能覆盖静态，或者被静态覆盖。


什么时候使用覆盖操作？
当对一个类进行子类的拓展的时，子类需要保留父类的功能声明。
但是要定义子类中该功能的特有内容时，就使用覆盖操作完成。

 */
/*
class Fu
{
    public  void show()
    {
        System.out.println("fu show run");
    }
}
class Zi extends Fu
{
    public  void show()
    {
        super.show();
        System.out.println("zi show run");
    }
}
public class ExtendsDemo2
{
    public static void main(String[] args)
    {
        Zi z=new Zi();
        z.show();
    }
}
*/
/*
子父类中构造函数的特点：
在子类构造对象时，发现访问子类构造函数的时候，父类也运行了。
为什么？
因为在子类构造函数中第一行有一个默认的隐式语句，super();
子类的实例化过程，子类中所有的构造函数默认都会访问父类中的空参数的构造函数

为什么子类实例化的时候要访问父类中的构造函数呢？
因为子类继承类父类，获取到了父类中的内容（属性），所以在使用父类内容之前，
要先看看父类如何对自己的内容进行初始化的，
所以子类在构造函数时，必须访问父类中的构造函数。
为什么完成这个必须的动作，就在子类的构造函数加入了super（）语句
如果父类中没有定义空参数构造函数，那么子类的构造函数，必须用super明确要调用父类中的那个构造函数
同时子类中的构造函数中，如果使用this调用了本类构造函数时
那么super就没有了，因为super和this都只能定义在第一行，所以只有一个，
但是，可以保证的是，子类中肯定会有其他的构造函数访问父类的构造函数

注意：super语句必须要定义在子类构造函数的第一行。因为，父类的初始化动作要先完成。
 */
/*
class Fu
{
    int num;
    Fu()
    {
        show();
    }
    void show()
    {
        System.out.println("fu run");
    }
    Fu(int x)
    {

        System.out.println("fu run"+x);
    }
}
class  Zi extends Fu
{
    int num = 8;
    Zi()
    {
        super();
        //-->通过super初始化父类内容时，子类的成员变量并未显示初始化。
        //等super父类初始化完毕后，才进行子类的成员变量显示初始化。
        System.out.println("zi run ...."+num);
        //super();//调用的就是父类中的空参数的构造函数
        //System.out.println("zi run"+super.num);
    }
    void show()
    {
        System.out.println("zi show "+num);
    }
    Zi(int x)
    {
        this();
        System.out.println("zi run"+x);

    }
}
public class ExtendsDemo2
{
    public static void main(String[] args)
    {
       Zi z = new Zi();
        System.out.println(z.num);
    }
}

/*
对一个对象实例化的过程：
HelloWorld.Person p=new HelloWorld.Person();
1.jvm会读取指定的路径下的Person.class文件，并加载进内存
并会先加载Person的父类（如果有直接的父类的情况下）。
2.在堆内存中开辟空间，分配地址。
3.并在对象空间中，对对象中的属性进行默认初始化。
4.调用对应的构造函数并进行初始化。
5.在构造函数中，第一行会先调用父类中的构造函数进行初始化。
6.父类初始化完毕后再对子类的属性进行显示初始化。
7.再进行子类的构造函数的特定初始化。
8.初始化完毕后，将地址赋给引用变量。

 */

