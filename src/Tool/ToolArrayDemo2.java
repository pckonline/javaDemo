package Tool;

/**
 * Created by online on 15-1-18.
 */
public class ToolArrayDemo2 {
    public static void main(String[] args){
    int sum = newAdd(1,2,3,4,5);
        System.out.println(sum);
    }
    /*
    函数的可变参数。
    其实就是一个数组，但是接收的是数组的元素。
    自动将这些元素
     */
    public static int newAdd(int... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
