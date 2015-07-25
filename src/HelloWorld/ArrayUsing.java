package HelloWorld;/*
        数组的一些运用。
 */

public class ArrayUsing
{
    public static void main(String[] args) {

          /* int[] arr = {1,2,3,4};
           for (int x=0;x<arr.length;x++)
           {
               System.out.println("arr{"+x+"]="+arr[x]);
           }
           }
           数组的遍历：数组名.length 是数组的长度

    {
        int[] arr={1,2,3,4,5,6,7,8};
        int max = getMax(arr);
        System.out.println("max="+max);
    }
        public static int getMax(int[] arr)
        {
            int max = arr[0];
            for(int x = 1;x < arr.length;x++)
            {

                if(arr[x]>max)
                {
                    max=arr[x];

                }

            }
            return max;
        }


            //获取数组中的最大值：1:需要进行比较，并定义记录较大的值。2,对数组中的元素进行遍历，和变量中记录的元素进行比较。
        //3，遍历结束，该变量记录的就是最大值
    {
        //选择排序

        int[] arr={11,556,6544,44,121,78,466,789};
        order(arr);
        for (int x =0;x < arr.length;x++)
        {
            System.out.println(arr[x]);
        }

    }
    public static void order(int[] arr)
    {
        for(int x = 0; x<arr.length-1;x++)
        {
            for (int y = x+1;y < arr.length;y++)
            {
                if(arr[y]<arr[x])
                {
                    int temp =arr[x];
                    arr[x] = arr[y];
                    arr[y]=temp;
                }
            }
        }
    }

    {
        //冒泡排序
        int[] arr={11,556,6544,44,121,78,466,789};
        print(arr);
        order2(arr);
        print(arr);
    }
    public static void order2(int[] arr)
    {
        for(int x = 0;x<arr.length-1;x++)
        {
            for (int y = 0;y<arr.length-1-x;y++)
            {
                if(arr[y]>arr[y+1])
                {
                    swap(arr,y,y+1);
                }
            }
        }
    }
    public static void print(int[] arr)
    {
        System.out.print("[");
        for(int x = 0;x < arr.length;x++)
        {
            if (x!=arr.length-1)
            {
                System.out.print(arr[x]+", ");

            }else System.out.println(arr[x]+"]");

        }
    }

    public static void swap(int[] arr,int a,int b)
    {
        if(arr[a]>arr[b])
        {
            int temp =arr[a];
            arr[a] = arr[b];
            arr[b]=temp;
        }
    }*/
    }
}


