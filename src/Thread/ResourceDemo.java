package Thread;

/**
 * Created by online on 14-11-30.
 */
/*
线程间通讯：
多个线程在处理同一个资源，但是任务不同。
 */
class Resource
{
    String name;
    String sex;
}
class Input implements Runnable
{
    Resource r ;
    Input(Resource r)
    {
        this.r = r;
    }
    public void run()
    {
//        Object obj = new Object();
        int x =0;
        while(true)
        {
            synchronized(r) {
                if (x == 0) {
                    r.name = "mike";
                    r.sex = "nan";
                } else {
                    r.name = "丽丽";
                    r.sex = "女女女";
                }
                x = (x + 1) % 2;
            }
        }
    }
}
class Output implements Runnable
{
    Resource r;
    Output(Resource r)
    {
        this.r = r;
    }
    public void run()
    {
        while(true)
        {
            synchronized (r){
        System.out.println(r.name+".."+r.sex);}
        }
    }
}
public class ResourceDemo
{
    public static void main(String[] args)
    {
        Resource r= new Resource();//首先创建一个Resource对象。
        Input in = new Input(r);//通过传参的形式使Input和Output的r.都是同一个
        Output out = new Output(r);

        Thread t1 = new Thread(in);//相当于传进去的r都是一样的  对同一个r进行不同的操作
        Thread t2 = new Thread(out);
        t1.start();
        t2.start();
    }
}
