package Thread;

/**
 * Created by online on 14-11-26.
 */
/*
创建线程的第二种方式：实现Runnable接口
1.定义类实现Runnable接口
2.覆盖接口中的run方法，将线程的任务代码封装到run方法中
3.通过Thread类创建线程对象，并将Runnable接口的子类对象作为构造函数的参数进行传递
    ？？ 因为线程的任务都封装在Runnable接口子类对象的run方法中
    所以要在线程  对象创建的时就必须要明确运行的任务
4.调用线程对象的start方法开启线程

实现Runnable接口的好处;
1.将线程的任务从线程的子类中分离出来，进行了单独的封装
按照面向对象的思想将任务封装成对象
2.避免了java单继承的局限性

所以，创建线程的第二种方式较为常用

 */

//Runnable 的出现仅仅是将线程的任务进行类对象的封装
class Demo1 implements Runnable//准备扩展Demo1的功能，让其中的内容可以作为线程的任务执行
        //通过接口的形式完成
{
    public void run() {
        show();
    }

    public void show() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + "..." + Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
//        Demo1 d1=  new Demo1();
//        Demo1 d2=  new Demo1();
//        d1.start();
//        d2.start();
    }
}
