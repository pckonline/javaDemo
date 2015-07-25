package Thread;

/**
 * Created by online on 14-11-26.
 */
/*
需求：卖票

 */
/*
  线程安全问题的产生原因：
  1.多个线程在操作共享的数据。
  2.操作共享数据的代码有多条。

  当一个线程在执行操作共享数据的多条代码过程中，其他线程参与了运算
  就会导致线程安全问题

  解决思路：
  就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，其他代码是不可以参与运算的
  必须要把这些代码都执行完后，其他线程才可以参与运算

  在java中使用同步代码块就可以解决问题

  同步代码块的格式：
  synchronized(对象)
  {
    需要被同步的代码;
  }

  同步的好处：解决了线程的安全问题

  同步的弊端：相对降低了效率，因为同步外的线程都会判断同步锁

  同步的前提：同步中必须有多个线程。并使用同一个锁。

*/
class Ticket implements Runnable//extends Thread
{
    private int num = 100; //定义成静态的，使四个窗口共享这100个票，
    //如果不定义成静态的，4个窗口会各自有100个票
    Object obj = new Object();

    public void run() {
        while (true)//当出现Exception的时候不执行输出
        {
            synchronized (obj) //同步代码块，同步需要操作的共享数据
            {
                if (num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {

                    }
                    System.out.println(Thread.currentThread().getName() + "...." + num--);
                }
            }
        }
    }
}

public class ThreadText {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread d1 = new Thread(t);
        Thread d2 = new Thread(t);
        Thread d3 = new Thread(t);
        Thread d4 = new Thread(t);
        d1.start();
        d2.start();
        d3.start();
        d4.start();
        /*
        为什么4个窗口执行卖票，输出的num值不是有序的？
        CPU快速切换，判定完num>0不一定先输出;
        线程的安全问题：有时候会一个线程并未输出，也就是num并未减
        就进行下个线程的执行时num还是原来的值，会导致出现0号甚至-1 ， -2号票。
        Ticket t1= new Ticket("1号");
        Ticket t2= new Ticket("2号");
        Ticket t3= new Ticket("1号");
        Ticket t4= new Ticket("1号");
        t1.start();//多次启动一个线程是非法的
        t2.start();
        t3.start();
        t4.start();
        */
    }
}
