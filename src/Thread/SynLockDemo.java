package Thread;

/**
 * Created by online on 14-11-27.
 */
/*
同步函数使用的锁是this

同步函数和同步代码块的区别：

同步函数的锁是固定的this
同步代码块的锁是任意对象

建议使用同步代码块，

静态的同步函数使用的锁是，该函数所属字节码文件对象，可以用this.getClass方法获取，
也可以用当前类名.class表示。


 */
class Tick implements Runnable
{
    private static int num = 100;
    //Object obj = new Object();
    boolean flag = true;
    public void run()
    {
        if(flag)
        {
            while(true)
            {
                synchronized(this.getClass())
                {
                    if(num>0)
                    {
                        try
                        {
                            Thread.sleep(100);
                        }
                        catch(InterruptedException e)
                        {}
                        System.out.println(num--+"..."+Thread.currentThread().getName());
                    }
                }
            }
        }
        else while(true)
        {
            show();
        }
    }
    public static synchronized void show()
    {
        if(num>0)
        {
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {}
            System.out.println(Thread.currentThread().getName()+"......"+num--);
        }
    }
}
public class SynLockDemo {
    public static void main(String[] args)
    {
        Tick t = new Tick();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {}
        t.flag = false;
        t2.start();
    }
}
