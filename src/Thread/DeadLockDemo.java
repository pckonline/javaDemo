package Thread;

/**
 * Created by online on 14-11-27.
 */
/*
死锁反应
常见的情景之一：同步的嵌套
 */
class Tick1 implements Runnable
{
    private static int num = 100;
    Object obj = new Object();
    boolean flag = true;
    public void run()
    {
        if(flag)
        {
            while(true)
            {
                synchronized(obj)
                {
                    if(num>0)
                    {
                       show();
                    }
                }
            }
        }
        else while(true)
        {
           show();
        }
    }
    public synchronized void show()
    {
        synchronized(obj){
        if(num>0)
        {
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {}
            System.out.println(Thread.currentThread().getName()+"......"+num--);
        }}
    }
}
public class DeadLockDemo
{
    public static void main(String[] args)
    {
        Tick1 t = new Tick1();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        try
        {
            Thread.sleep(10);
        }
        catch(InterruptedException e)
        {}
        t.flag = false;
        t2.start();
    }
}
