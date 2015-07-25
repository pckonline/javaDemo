package faceToObject;

/*
初始化过程
1.Object-->显示初始化 -->构造代码块初始化
super一直调到最父类-->显示初始化-->构造代码块(这里子类super执行完毕)-->显示初始化-->构造代码块
这个程序的运行顺序
1.new一个Zi1()-->找到子类中的构造函数
2.运行子类构造函数中的super()(super是隐藏的)-->找到父类构造函数
3.运行父类构造函数中的super()-->找到Object-->父类构造函数中的super()结束
4.运行 父类的显示初始化 即int num = 9;和构造代码块-->运行show()
5.因为子类中有show()  所以执行子类中的show（继承中的成员函数看new的右边）-->子类的构造函数的super结束
6.运行 子类的显示初始化 即int num = 10;和构造代码块-->运行System.out.println("Zi show  "+num);
 */
class Fu1
{
    int num = 9;//显示初始化
    {
        System.out.println("ahah"+num);//构造代码块
    }
    Fu1()
    {
        //这里有super();
        super();
        show();
    }
    void show()
    {
        System.out.println("show");//被覆盖，运行子类show
    }
}
class Zi1 extends Fu1
{
    int num = 10;
    {
        System.out.println("Zi run.."+num);
    }
    Zi1()
    {
        //这里有super();
        super();
        System.out.println("Zi show  "+num);
    }
    void show()
    {
        System.out.println("Zi show  show   "+num);//为什么是0, 因为在运行的时候是子类的num
        //并未被赋值，如果时super.num  即是Zi show  show   9
    }
}
public class Initialize
{
    public static void main(String[] args)
    {
        new Zi1();
    }
}
