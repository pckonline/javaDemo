package Thread;

/*
进程：正在进行中的程序（）。

线程：就是进程中的一个负责程序执行的控制单元（执行路径）
一个进程中可以有多个执行路径  称为多线程

一个进程当中 至少要有一个线程。

开启多个线程是为了同时运行多部分代码
每一个线程都有自己运行的内容，这个内容可以称为线程要执行的任务。

多线程的好处：解决了多部分同时运行的问题。

多线程的弊端：线程太多会导致效率的降低。

其实应用程序的执行都是cpu在做着快速的切换完成的，这个切换是随机的。

JVM启动时就启动了多个线程，至少有两线程可以分析的出来

1.执行main函数的线程
    该线程的任务代码都定义在main中
2.负责回收垃圾的线程

 */
/* //垃圾回收机制
class Demo extends Object
{
    public void finalize()
    {
        System.out.println("收垃圾了！");
    }
}
public class ThreadDemo
{
    public static void main(String[] args)
    {

        new Demo();
        new Demo();
        new Demo();
        System.gc();
        System.out.println("haha");

    }
}
*/
/*
如何创建一个线程？
一：继承Thread类
步骤：
1.定义一个类继承Thread类。
2.覆盖Thread类中的run方法。
3.直接创建Thread类的子类对象
4.调用start方法开启线程并调用线程任务的run方法执行

可以通过Thread的getName()获取线程的名称，Thread-编号（从0开始）
Thread.currentThread().getName() 运行线程的名称  主函数 是main
主线程名字就是main
 */

/*
创建线程的第一个方法：继承Thread类
 */

class Demo extends Thread {
    private String name;

    Demo(String name) {
        super(name);//通过传值可以改变getName的名字
        //this.name = name;
    }

    public void run() {
        for (int y = -9; y < 9; y++) {
            // int[] arr = new int[3];
            //System.out.println(arr[3]);
            System.out.println(name + "....." + y + "....name=" + Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        /*
        创建线程的目的是为了开启一条执行路径去运行指定的代码和其他代码实现同时运行。
        而运行的指定代码就是这个执行路径的任务

        jvm创建的主线程的任务都定义在了主函数中
        而自定义的线程它的任务在哪？
        Thread类用于描述线程，线程是需要任务的，所以Thread类也对任务的描述
        这个任务就通过Thread类中的run方法来实现。也就是说，run方法就是封装自定义线程运行任务的函数
        run方法中定义就是线程要运行的任务代码

        开启线程是为了运行指定代码，所以只有继承Thread类，并复写run方法。
        将运行的代码定义在run方法中即可。
         */
        Demo d1 = new Demo("熊大");
        Demo d2 = new Demo("熊二");
        d1.start();
        d2.start();
        for (int x = 0; x < 20; x++) {
            System.out.println(4 / 0);//多线程中一个线程出错不影响其他线程的继续进行
            System.out.println(x + "..." + Thread.currentThread().getName());
        }

    }
}
/*
CPU的执行资格：可以被CPU处理，在处理的队列中排队
CPU的执行权：正在被CPU处理
线程的运行状态：具备执行资格，具备执行权  start
线程的临时阻塞状态：具备执行资格，不具备执行权
线程的冻结状态：释放执行权的时候同时释放执行资格   sleep(time)   wait 对应notify
线程的消亡：stop run方法的结束，线程的任务结束
 */