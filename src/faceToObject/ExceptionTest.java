package faceToObject;

/*
老师用电脑上课：
问题涉及到两个对象  老师 电脑

分析其中的问题
比如电脑蓝屏了。

 */
class LanPingException extends Exception
{
    LanPingException(String msg)
    {
        super(msg);
    }
}
class MaoYanException extends Exception
{
    MaoYanException(String msg)
    {
        super(msg);
    }
}
class NoPlanException extends Exception
{
    NoPlanException(String msg)
    {
        super(msg);
    }
}
class Computer
{
    private int state = 1;
    public void run()throws LanPingException,MaoYanException
    {
        if(state ==1)
        {
            throw new LanPingException("电脑蓝屏");
        }
        if(state ==2)
        {
            throw new MaoYanException("电脑冒烟");
        }
        System.out.println("电脑运行");
    }
    public void reset()
    {
        state = 0;
        System.out.println("电脑重启");
    }
}
class Teacher
{
    private String name;
    private Computer comp;
    Teacher(String name)
    {
        this.name = name;
        comp = new Computer();
    }
    public void prelect()throws NoPlanException
    {
        try{
        comp.run();
        System.out.println(name+"讲课");
        }
        catch(LanPingException e)
        {
            System.out.println(e.toString());
            comp.reset();
            prelect();
        }
        catch(MaoYanException e)
        {
            System.out.println(e.toString());
            test();
            throw new NoPlanException("计划无法完成");
        }
    }
    public void test()
{
    System.out.println("大家做练习");
}
}
public class ExceptionTest
{
    public static void main(String[] args)throws NoPlanException
    {
        Teacher t = new Teacher("bi老师");
        try
        {
            t.prelect();
        }
        catch(NoPlanException e)
        {
            System.out.println(e.toString());
            System.out.println("......");
        }
    }

}
//throw 好比在try扔出去  throws在函数第一行表示在这个函数中你扔掉了谁  在主函数中如果最后执行的
// 是扔出去的语句  则 主函数要声明 throws收到了谁 try 表示会出现的错误  catch表示收到扔的new 。。Exception