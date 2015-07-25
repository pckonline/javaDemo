package HelloWorld;

/*
二位数组的定义格式
 */
public class ArrayDemo
{
    public static void main(String[] args)
    {
        //一维数组   int[] arr = new int[3]
        /*
        int[][] arr=new int[3][2];//创建一个二位数组，该数组中有3个一维数组，每个一维数组中有2个元素。

        System.out.println(arr);//直接打印二位数组 [[I@15db9742   @左边是实体的类型  @右边是实体的哈希值。
        System.out.println(arr[0]);打印二维数组中的角标为0的一维数组
        System.out.println(arr[0][0]);//直接打印二维数组中的角标为0的一维数组中的角标为0的元素  0
        */
        /*
        int[][] arr=new int[3][];
        arr[0]=new int[2];
        arr[1] = new int[1];
        arr[2] = new int[3];
        //分别对二位数组中的每一个小数组进行初始化；
        */
        /*
        //定义二维数组  并给其数值
        int[][] arr={{1,2},{3,4,5},{6,7,8,9}};//在二位数组中定义3个一维数组  角标为0的一维数组中有2个元素  1的有3个元素 2的有4个元素
        for (int x =0 ; x<arr.length;x++)
        {
            for (int y =0 ;y<arr[x].length;y++)
            {
                System.out.print(arr[x][y]+",");
            }
            System.out.println();
        }
        */
        //二维数组的应用场景  当数据 杂乱无章时   二维数组的应用有优势  使数据更加明确

    }
}
