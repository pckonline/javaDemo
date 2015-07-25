package HelloWorld;

/*
比较两个数 和三个数的大小  取最大值
 */
public class Compare
{
    public static void main(String[] args)
    {
        /*
        比较三个数的大小 取最大值， 三元运算符 ？  ：
        int a = 1, b = 2 , c= 3;
        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        System.out.println(max);//记住格式
         */
        int x = 4;
        switch (x)
        {
            default:
                System.out.println('s');
              break;
            case 1:
                System.out.println('a');
                break;
            case 3:
                System.out.println('b');
                break;
            case 4:
                System.out.println('c');
        }

    }
}
