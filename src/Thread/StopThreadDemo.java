package Thread;

/**
 * Created by online on 14-12-3.
 */
/*
停止线程：
1.stop方法

2.run方法结束
怎么控制线程任务的结束呢
任务中都会有循环结构，只要控制住循环，就可以结束任务。

控制循环通常用定义标记来完成

但是如果线程处于了冻结状态， 就无法读取标记，如何结束？

t1.interrupt();//可以使用interrupt方法将线程从冻结状态中强制恢复到运行状态中来，让线程具备CPU的执行资格

但是强制动作会发生中断异常，记得要处理。
 */
class StopThread implements Runnable
{
    private boolean flag = true;
    public synchronized void run()
    {
        while(flag)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(Thread.currentThread().getName()+"...."+e.toString());
                flag = false;
            }
            System.out.println(Thread.currentThread().getName()+"....+");
        }
    }
    public void setFlag()
    {
        flag = false;
    }
}
public class StopThreadDemo
{
    public static void main(String[] args)
    {
        StopThread st = new StopThread();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        t1.start();
        t2.setDaemon(true);
        t2.start();
        int num = 0;
        for(;;)
        {
            if(num ==50)
            {
                //st.setFlag();
                t1.interrupt();//
                //t2.interrupt();
                break;
            }
            System.out.println("main.."+num++);
        }
    }
}
