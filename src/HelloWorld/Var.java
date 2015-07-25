package HelloWorld;

/**
 变量演示
 */
class Vor
{

    private Vor()//该类中的方法都是静态的，所以该类是不需要创建对象的，为了保证不让其他成员创建对象
            //可以将构造函数私有化
    {

    }

    /**
     *
     * @param arr
     * @return
     */
    public static String arrToString(int[] arr)
    {
        String str = "[";
        for (int x = 0; x < arr.length; x++)
        {
            if (x != arr.length - 1)
                str = str + arr[x] + ", ";
            else str = str + arr[x] + "]";

        }
        return str;
    }
}
public class Var
{
    public  static void  main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7};
        String c=Vor.arrToString(arr);
        System.out.println(c);
       // for (int x= 0 ; x< arr.length;x++)
       // {
       //     System.out.println(arr[x]);
       // }
        //数据类型  变量名=初始化值
        //byte b = 3;//定义变量
       // b = 8; //使用变量
        //System.out.println(b);
    }
}

