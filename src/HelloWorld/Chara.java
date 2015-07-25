package HelloWorld;

/*
 字符常量的相关知识
  */
public class Chara
{
    public static void main(String[] args)
    {
        System.out.println('a');//输出字符常量“a”
        System.out.println('a'+1);//正确，输出98,a的ASCII值为97 这样写时 a的ASCII值加1
        System.out.println((char)('a'+1));//强制转换成字符类型；
        System.out.println('你'+0);//GBK中文表（类似于ASCII） unicode 国际碼表
        byte b = 4;//4是int类型  只要4在byte范围内 强转给b
        //b = 3 + 7;//正确，3  7 相当于10的int值  在byte范围内  强转给b
        /*
        byte b1 = 3;
        byte b2 = 7;
        b = b1 + b2;
         *///错误，b1  b2 是变量，无法确定其值，不一定在byte范围内，
        /*
        int x;
        x=b1+b2;//正确，在x范围内，装的下。
         */
        /*
        int x;
        int x1=integer.MAX_VALUE;
        int x2 = 2;
         *///错误。值过大时编译正确，因值过大输出错误

    }
}
