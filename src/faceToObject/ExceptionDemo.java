package faceToObject;

/*
异常：是在运行时发生的不正常情况.
在java中用类的形式对不正常情况进行了描述和封装对象。
描述不正常的类就叫做异常类。
以前正常流程代码和问题处理代码相结合。
现在把正常流程代码和问题处理代码分离出来，提高阅读性。

 其实异常就是java通过面向对象的思想将问题封装成了对象。
 用异常类进行描述。

不同的问题用不同的类进行具体的描述，不如脚标越界，空指针等

问题很多，意味着描述的类也很多，
将其共性向上抽取，形成了异常体系。

最终异常就分成了两大类。
Throwable :无论时error 还是exception 问题，问题发生就应该抛出，让调用者知道并处理。
    该体系的特点就在于Throwable及其所有子类都具有可抛性。
    可抛性指的是什么？
    其实就是通过两个关键字体现的
    throws throw，凡是可以被这两个关键字所操作的类和对象都具备可抛性。
    |--1.一般不可处理的。Error
    特点：是由jvm抛出的严重性的问题。
    这种问题发生一般不针对性处理，直接修改程序。
    |--2.可处理的。Exception


该体系的特点：
    子类的后缀都是用父类的名字作为后缀 阅读性很强。
    在一个代码块中异常语句后的语句不执行（出现异常的时候把异常交给JVM处理  并结束语句）
 */
/*
class FuTime
{
    FuTime()
    {
        System.out.println("bunengshui");
    }
}
class BigTime
{
    BigTime()
    {
        System.out.println("shijian");
    }

}
public class ExceptionDemo
{
    public static void main(String[] args)
    {
       // int []arr = new int[3];
       // arr = null;//NullPointerException  空指针
        //System.out.println(arr[3]);//Exception in thread "main" java.lang.
                                    // ArrayIndexOutOfBoundsException: 3 脚标越界
        sleep(-5);
    }
    public static void sleep(int time)
    {
        if(time< 0)
        {
            new FuTime();//就代码着复数的情况，这个对象中包含着问题的名称 信息 位置等信息。
        }
        else if(time>100000)
        {
            new BigTime();
        }
        else
        System.out.println("睡" + time);
    }
}
*/
class Demo0
{
    public int method(int[]arr , int index)
    {
        //System.out.println(arr[index]);//throw new ArrayIndexOutOfBoundsException: 3
       // System.out.println("haha");//不输出
        if(arr ==null)
        {
            throw new NullPointerException("数组的引用不能为空");
        }
        if (index>=arr.length)
        {
           throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }
}
public class ExceptionDemo {
    public static void main(String[] args)
    {
        int[] arr = new int[3];
        Demo0 d = new Demo0();
        //d.method(arr,3);//ArrayIndexOutOfBoundsException: 3  交给JVM处理 并结束语句
        int num = d.method(null ,30);
        System.out.println("num = "+num);
        System.out.println("over");//不输出
    }
}