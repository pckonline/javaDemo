package Thread;

/**
 * Created by online on 14-11-27.
 */
/*
多线程下的单例模式
 */
//饿汉式
class Single
{
    private static final Single s = new Single();
    private Single(){};
    public static Single getInstance()
    {
        return s;
    }
}
//懒汉式
class Single1
{
    private static Single1 s = null;
    private Single1(){};
    public static Single1 getInstance()
    {
        if(s==null){
        synchronized(Single1.class){
            if(s== null)
            s= new Single1();}
        }
        return s;
    }
    public void show()
    {
        System.out.println("haha");
    }
}
public class SingleDemo
{
    public static void main(String[] args)
    {
        Single1 s1= Single1.getInstance();
        s1.show();
    }
}
