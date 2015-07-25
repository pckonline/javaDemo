package faceToObject;

import java.lang.reflect.Array;

/*
对于脚标是整数不存在，可以用脚标越界表示
对于负数为脚标的情况，准备用负数脚标异常来表示

负数脚标异常在java中并没有定义过。
那就按照java异常的创建思想，面向对象，将负数脚标进行自定义描述，并封装成对象
这种自定义的问题描述称为自定义异常
注意：如果让一个类成为异常类，必须要继承异常体系，因为只有称为异常体系的子类才具备可抛性
才可以被两个关键字所操作：throw throws

异常的分类：
1.编译时被检测异常：只要是Exception和其子类都是，除了特殊子类RuntimeException体系
    这种问题一旦出现，希望在编译时进行检测，让这种问题有对应的处理方式
    这样的问题都可以针对性处理

1.编译时不检测异常（运行异常 ）：就是Exception中的RuntimeException和其子类。
    这种问题的发生，无法让功能继续，运算无法进行，更多是因为调用者导致的或者引发类内部状态的改变导致的
    那么这种问题一般不处理，直接编译通过，在运行时，让调用者在调用的时候程序强制停止，让调用者进行代码修改

    所以自定义异常时，要么继承Exception，要么继承RuntimeException

    throw 和 throws
    1.throw 使用在函数内
    throws使用在函数上。
    2.throws抛出的是异常类，可以抛出多个，用逗号隔开
    throw抛出的是异常对象。
 */
/*
异常处理的捕捉形式：
这是可以对异常进行针对性处理的方式。
具体格式是：
try
{
    //需要被检测异常的代码。
}
catch(异常类 变量)//该变量用于接收发生异常的对象
{
    //处理异常的代码。
}
finally
{
    //一定会被执行的代码。
}

异常处理的原则：
1.函数内容如果抛出需要检测的异常，那么函数上必须要声明。
否则必须在函数中用try catch捕捉。否则编译失败。

2.如果调用到了声明异常的函数，要么try catch  要么throws  否则编译失败。
3.什么时候catch  什么时候 throws？
功能内容可以解决用catch。
解决不了用throws告诉调用者，由调用者解决
4.一个功能如果抛出了多个异常，那么调用时，必须对应多个catch进行针对性处理。
    内部有几个需要检测的异常就要抛几个异常，抛出几个就catch几个
 */
class FuShuIndexException extends Exception
{
    FuShuIndexException()
    {

    }
    FuShuIndexException(String msg)
    {
        super(msg);//父类中有定义了  不能定义为子类自己的话语  只是super(msg)
    }
}
class Demo00
{
    public int method(int[]arr , int index)throws NullPointerException, FuShuIndexException
    {
        //System.out.println(arr[index]);//throw new ArrayIndexOutOfBoundsException: 3
        // System.out.println("haha");//不输出
        if(arr==null){
            throw new NullPointerException("没有任何数组实体");
        }
        if (index<0){
            throw new FuShuIndexException("脚标不能为负数啊");
        }
        return arr[index];
    }
}
public class ExceptionDemo2
{
    public static void main(String[] args)
    {
        int[] arr = new int[3];
        Demo00 d = new Demo00();
        try
        {
            int num = d.method(arr,-1);
            System.out.println("num = "+num);
        }
        catch(NullPointerException f)
        {
            System.out.println(f.toString());
            System.out.println("数组不能为空");
        }
        catch(FuShuIndexException e)//即FuShuIndexException e = new FuShuIndexException();
        {
            System.out.println("message:"+e.getMessage());
            System.out.println("toString:"+e.toString());
            //e.printStackTrace();//JVM默认的异常处理机制就是调用异常对象的这个方法。
            System.out.println("负数脚标异常");
        }
        /*
        catch(Exception e)//多catch父类的catch放在最下面，否则编译失败。
        {

        }
        */
        //d.method(arr,3);//ArrayIndexOutOfBoundsException: 3  交给JVM处理 并结束语句


        System.out.println("over");//不输出
    }
}
