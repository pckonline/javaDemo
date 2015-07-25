package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by online on 14-12-1.
 */
/*
生产者 消费者
多生产者，多消费者
if判断标记，只有一次，会导致不该运行的线程运行了，出现了数据异常。
while判断标记，解决了线程获取执行权后，是否要运行！

notify：只能唤醒一个线程，如果唤醒本方线程，没有意义，而且while判断+notify会导致死锁
notifyAll解决了本方线程一定会唤醒对方线程的问题。

同步代码块对于锁的操作是隐式的。

Lock接口：它的出现替代了同步代码块或者同步函数，将同步的隐式锁操作变成显示锁操作。
同时更为灵活。可以一个锁上有多个监视器
lock():获取锁
unlock():释放锁，通常需要定义在finally代码块中

Condition接口：它的出现代替Object中的wait notify notifyAll方法
                将这些监视器方法进行封装，变成Condition监视器对象
                 可以任意锁进行组合
await()：相当于wait
signal()：相当于notify
signalAll()：相当于notifyAll
 */
class Resourced
{
    private String name;
    private int count= 1;
    private boolean flag = false;
    //创建锁对象
    Lock lock = new ReentrantLock();

    //通过已有的锁获取该锁上的监视器对象
    Condition con = lock.newCondition();
    Condition com = lock.newCondition();//创建两个该锁的监视对象。一个监视生产者，一个监视消费者
    public void setName(String name)
    {
        lock.lock();
        try
        {
            while(flag)//多生产与单生产的区别
                try{con.await();}catch(InterruptedException e){}
            //若flag 监视生产者的等待
            this.name = name+count++;
            System.out.println(Thread.currentThread().getName()+"...生产一只烤鸭5.0.."+this.name);
            //notifyAll();
            com.signal();
            flag = true;
        }
        finally
        {
            lock.unlock();
        }
    }
    public  void out()
    {
        lock.lock();
        try {
            while (!flag)
                try {
                    com.await();
                } catch (InterruptedException e) {
                }
            System.out.println(Thread.currentThread().getName() + "...消费5.0...." + this.name);
            con.signal();
            //notifyAll();
            flag = false;
        }
        finally
        {
            lock.unlock();
        }

    }
}
class Producer implements Runnable
{
    private Resourced r;
    Producer(Resourced r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
        {
            r.setName("烤鸭");
        }
    }
}
class Consumer implements Runnable
{
    private Resourced r;
    Consumer(Resourced r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
        {
            r.out();
        }
    }
}
public class ProducerConsumerDemo
{
    public static void main(String[] args)
    {
        Resourced r = new Resourced();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);

        Thread t0 = new Thread(p);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
wait 和 sleep 区别？
1.wait 可以指定时间，也可以不指定时间
sleep必须指定时间

2.在同步中时，对于CPU的执行权和锁的处理不同。
    wait释放执行权，释放锁。cheng
    sleep释放执行权，不释放锁。
void show
 */

