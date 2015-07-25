package HelloWorld;

/*
    变量：自动类型转换
 */
public class Var2
{
    public static void  main(String[] args)
    {
        int x = 3;//定义变量
        x = x + 5;//开辟运算空间 x = 3 与5相加 后传入x空间
        //运算类型不同 不能运算 （数值类型之间能运算）低存储类型提升空间大小后运算 如：
       /*
        int x = 3;
        byte b = 2;
        x = x + b;// 正确
        */
    }
}
