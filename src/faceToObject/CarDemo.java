package faceToObject;

/*
面向对象的入门操作
*/
 /*描述一个小汽车
    1.属性
    轮胎数
    颜色
    2.行为
    运行
    定义类就是定义类中的成员
  成员变量---》属性   成员函数---》行为
    */
/*
成员变量和局部变量的区别
1.
成员变量定义在类中，整个类中都可以访问
局部变量定义在函数 语句 局部代码块中，只在所属的区有效
2.
成员变量存在于堆内存的对象中
局部变量存在于栈内存的方法中
3.
成员变量随着对象的创建而存在，随着对象的消失而消失
局部变量随着所属区域块执行而存在，随着区域块的结束而消失
4.
成员变量都有默认初始化值
局部变量没有默认初始化值
 */
 class Car
{
  int a;
  String color;
    void run()
    {
        System.out.println(a+","+color);
    }
}


public class CarDemo
{
    public static void main(String[] args)
        {
            /*
            //在计算机中创建一个car的实例，通过new关键字
            Car c1=new Car();//a就是一个类类型的引用变量，指向了该类的对象。
            Car c2=c1;
            c1.a=4;
            c2.color="red";
            c1.run();//要使用对象中的内容可以通过  对象.成员的形式来调用
            //结果是4 red
            */
            /*
            Car c1 = new Car();
            Car c2 = new Car();
            Car c3 = new Car();
            show(c1);
            show(c2);
            */
            //匿名对象  new Car()  当对象对方法仅进行一次调用的时候，就可以使用匿名对象
            // Car c = new Car()  c.run() 改成  new Car().run();
            //匿名对象可以作为实际参数进行传递
        }
    //利用函数对汽车的改装  提高复用性
    /*
    public static void show(Car x)//类类型的对象一定只想对象，要不就是空
    {
        x.a=4;
        x.color="red";
        System.out.println(x.a+","+x.color);
    }
    */
}
