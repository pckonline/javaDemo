package faceToObject;

/*
    获取一个整数的16进制 2进制  8进制的表现形式（完美合集）
 */
public class JinZhi
{
    public static void main(String[] args)
    {
        toHex(60);//16进制
        toBinary(60);//2进制
        toOctal(60);//8进制
    }
    /*
    什么时候使用数组呢？
    如果数据出现了对应关系，而且对应一方是有序的数字编号。并作为角标使用。
    这个时候必须想到数组的使用。
    只要将运算的结果作为数组的角标去对应数组中的元素就可以
    简称 查表法
    有时查到的数据会比较多，数据一多  就先存储起来再进行操作
    所以定义一个数组  当一个容器
    */
    /*
    public static void toHex_1(int x)
    {
        char[] ch={'0','1','2','3','4','5','6','7','8','9','HelloWorld.A','B','C','D','E','F'};

    //public static void toHex(int x)

        for (int a=0 ;a < 8 ;a++)
        {
             int temp = x & 15;
                System.out.println(ch[temp]);

            x = x>>>4;
        }
    }*/

    public static void  toHex(int x)
    {
        trans(x,15,4);
    }
    public static void  toBinary(int x)
    {
        trans(x,1,1);
    }
    public static void  toOctal(int x)
    {
        trans(x,7,3);
    }
    public static void trans(int x,int y ,int z)
    {
        if (x==0)
        {
            System.out.println('0');
            return;
        }

        char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] arr = new char[9];
        int pos = 0;
        while(x!=0)
        {
            int temp = x & y;
            arr[pos] = ch[temp];
            pos++;
            x = x>>>z;
        }
        for (int o =pos-1;o>=0;o--)
        {
            System.out.print(arr[o]);
        }
        System.out.println();
    }


}
