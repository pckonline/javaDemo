package HelloWorld;/*
数组的查找
 */

public class ArrayFind
{
    public static void main(String[] args) {
    /*
        int[] arr ={4,2,5,1,3,6,7,8};
        int index = find(arr,6);
        System.out.println("index="+index);
    }
    public static int find(int[] arr,int key)
    {
        for(int x = 0;x < arr.length;x++)
        {
            if(arr[x]==key)
                return x;
        }
        return -1;
        */
        /*
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=halfSearch(arr,10);
        System.out.println("k="+k);

    }
    public static int halfSearch(int[] arr , int key)
    {
        int max , min , mid ;
        max = arr.length-1;
        min = 0;
        mid = (max+min)/2;
        while(arr[mid]!=key)
        {
            if(key>arr[mid])
            {
                min=mid+1;
            }
            else if(key<arr[mid])
            {
                max = mid-1;
            }
            if(max<min)
                return -1;
            mid = (max+min)/2;

        }
        return mid;
    }
    */
     //面试题    给定一个有序的数组如果往该数组中存储一个元素，并保证这个数组还是有序的。那个元素的存储的角标如何获取
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=halfSearch(arr,5);
        System.out.println("k="+k);

    }
    public static int halfSearch(int[] arr , int key)
    {
        int max , min , mid ;
        max = arr.length-1;
        min = 0;
        mid = (max+min)/2;
        while(arr[mid]!=key)
        {
            if(key>arr[mid])
            {
                min=mid+1;
            }
            else if(key<arr[mid])
            {
                max = mid-1;
            }
            if(max<min)
                return -1;//return min  就是返回该元素的位置
            mid = (max+min)/2;
        }
        return mid;
    }


}
