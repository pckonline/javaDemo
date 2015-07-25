package HelloWorld;

/*
       高效的运算符  位运算符
 */
public class Ture
{
    public static void main(String[] args)
    {
        /*System.out.println(6&2);输出2   6&3  110     6&3=2     6 | 3=7  6^3=5   6^3^3^=6
                                              &011
                                            ----------
                                              010  //0是false  1是ture  0&1 false 就是0一个数异或同一个数两次  结果还是这个数
                                              异或的作用   加密或解密
                                                 */


        //System.out.println(2<<3);  //2 * 8 的值

        //不需要第三方变量的两个数值交换运算（效率可以， 开发时候用， 阅读性强）
       /* int a = 3 ;
        int b = 5;
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("a="+a+",b="+b);//（如果两个数值过大  可能会超过范围 造成精度错误。）
        */


        //异或方法 使两个数值交换  （阅读性差   面试时候用)
       /*
        int a = 3 ;
        int b = 5;
        a = a ^ b;
        a = a ^ b;
        b = a ^ b;
        System.out.println("a="+a+",b="+b);
         */


    }

}
