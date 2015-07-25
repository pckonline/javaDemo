package faceToObject;

/*
静态什么时候用?
1.静态变量
当分析对象中所具备的成员变量的值都是相同的
这时这个成员就可以被静态修饰
只要数据在对象中都是不同的，那就是对象的特有数据：必须存储在对象中，是非静态的
如果相同的数据，对象不需要修改，只要使用即可，不需要存储在对象中。

2.静态函数
函数是否用静态修饰，就参考一点，就是该函数功能是否访问到对象中特有数据。
简单点说，从源代码看，该功能是否需要访问非静态的成员变量，如果需要，该功能就是非静态的
如果不需要，就可以将该功能定义为静态的
 */
/*
静态代码块
随着类的加载而执行,而且只执行一次
作用，用于给类进行初始化
 */
/*
构造代码块可以多次调用，随着对象的创建而出现一次
可以给所有的对象进行初始化。
 */
//文档注释 ：javadoc -d 所放到的文件下 -author -version 文件名.java

class Static
{
    private String name;
/*static //静态代码块
    {
        System.out.println("haha");
    }
    */
{
    System.out.println("哇哇");//构造代码块  可一多次执行
}
    Static(String name)//构造函数是给对应的对象进行针对性的初始化。
    {
        this.name= name;
    }
    void show()
    {
        System.out.println(name);
    }
}

public class StaticDemo2
{
    static
    {
        System.out.println("hehe");
    }
    public static void main(String[] args)
    {
        new Static("旺财").show();
        new Static("black").show();//
    }
}


