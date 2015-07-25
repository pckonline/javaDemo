package Thread;

/**
 * Created by online on 14-11-30.
 */
/*
等待唤醒机制：
涉及的方法

1.wait():让线程处于冻结状态，被wait的线程会被储存到线程池中。
2.notify()：唤醒线程池中的一个线程（任意）。
3.notigyAll：唤醒线程池中的所有线程。
这些方法都必须定义在同步中，
因为这些方法是用于操作线程状态的方法，
必须要明确那个锁上的线程

为什么操作线程的方法wait notify notifyAll定义在了Object类中

因为这些方法是监视器的方法，监视器就是其锁，
锁可以是任意对象，任意的对象调用的方式 一定在Object中
 */
class Resource1
{
    String name;
    String sex;
    boolean flag=false;
}
class Input1 implements Runnable
{
    Resource1 r ;
    Input1(Resource1 r)
    {
        this.r = r;
    }
    public void run()
    {
//        Object obj = new Object();
        int x =0;
        while(true)
        {
            synchronized(r)
            {
                if(r.flag)
                    try{r.wait();}catch(InterruptedException e){}
                //当flag是true的时候，该线程等待，从而进行另外一条线程
                if (x == 0) {
                    r.name = "mike";
                    r.sex = "nan";
                } else {
                    r.name = "丽丽";
                    r.sex = "女女女";
                }
                r.flag = true;
                r.notify();
            }
            x = (x + 1) % 2;//保证输入的name和sex交替
        }
    }
}
class Output1 implements Runnable
{
    Resource1 r;
    Output1(Resource1 r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
        {
            synchronized (r){
                if (!r.flag)
                    try{r.wait();}catch (InterruptedException e){}
                System.out.println(r.name+".."+r.sex);
                r.flag = false;
            r.notify();
            }
        }
    }
}
public class ResourceDemo2
{
    public static void main(String[] args)
    {
        Resource1 r= new Resource1();//首先创建一个Resource对象。
        Input1 in = new Input1(r);//通过传参的形式使Input和Output的r.都是同一个
        Output1 out = new Output1(r);

        Thread t1 = new Thread(in);//相当于传进去的r都是一样的  对同一个r进行不同的操作
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }
}
