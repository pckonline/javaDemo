package Thread;

/**
 * Created by online on 14-12-1.
 */
/*
线程的等待唤醒机制代码优化
 */
class Resource2
{
    private String name;
    private String sex;
    boolean flag=false;
    public synchronized void set(String name,String sex)
    {
        if(flag)
            try{wait();}catch(InterruptedException e){}
        this.name = name;
        this.sex  = sex;
        flag = true;
        notify();
    }
    public synchronized void out()
    {
        if(!flag)
            try{wait();}catch(InterruptedException e){}
        System.out.println(name+"..."+sex);
        flag = false;
        notify();
    }
}
class Input2 implements Runnable
{
    Resource2 r ;
    Input2(Resource2 r)
    {
        this.r = r;
    }
    public void run()
    {
//        Object obj = new Object();
        int x =0;
        while(true)
        {
            if(x==0)
                r.set("mike","nan");
            else r.set("丽丽","女女女女女");
            x = (x+1)%2;
        }
    }
}
class Output2 implements Runnable
{
    Resource2 r;
    Output2(Resource2 r)
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
public class ResourceDemo3
{
    public static void main(String[] args)
    {
        Resource2 r= new Resource2();//首先创建一个Resource对象。
        Input2 in = new Input2(r);//通过传参的形式使Input和Output的r.都是同一个
        Output2 out = new Output2(r);

        Thread t1 = new Thread(in);//相当于传进去的r都是一样的  对同一个r进行不同的操作
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }
}