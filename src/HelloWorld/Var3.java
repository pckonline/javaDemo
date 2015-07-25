package HelloWorld;

/*
    强制类型转换
 */
public class Var3
{
    public static void main(String[] args)
    {
        byte b = 3;
       // b = b + 4;//错误，b为一字节空间 4为int默认4字节空间，相加后为4字节空间 传到一字节b中 数据丢失；
        b =(byte) (b + 4);//丢失高字节的前几个字节 留最后一个字节；
       //强制类型转换；
        System.out.println(b);
    }
}
//输出 7
