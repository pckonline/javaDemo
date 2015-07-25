package Thread;

/**
 * Created by online on 14-12-3.
 */
//线程面试题
    /*
class Test implements Runnable
{
    public void run(Thread t)
    {}
}*///错误,错误发生在第一行，实现接口并未覆盖run方法，
public class ThreadTest
{
    public static void main(String[] args)
    {
        new Thread(new Runnable()//先子类，没有子类再任务
        {
            public void run()
            {
                System.out.println("Run  run");//任务
            }
        }
        )
        {
            public void run()
            {
                System.out.println("subThread run");
            }
        }.start();//子类
        /*
        new Thread()
        {
            public void run()
            {
                for(int x = 0 ; x < 50 ; x++)
                {
                    System.out.println(Thread.currentThread().getName()+"x :"+x);
                }
            }
        }.start();
        for(int x = 0 ; x < 50 ; x++)
        {
            System.out.println(Thread.currentThread().getName()+"y :"+x);
        }
        Runnable r = new Runnable()
        {
            public void run()
            {
                for(int x = 0 ; x < 50 ; x++)
                {
                    System.out.println(Thread.currentThread().getName()+"z :"+x);
                }
            }
        };
        new Thread(r).start();*/

    }
}
