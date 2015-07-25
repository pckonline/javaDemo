package UseObject;

/**
 * Created by online on 14-12-3.
 */
public class StringConstructorDemo
{


    public static void main(String[] args)
    {
        stringConstructorDemo2();
    }
    public static void stringConstructorDemo2() {
        char[] arr = {'w','a','p','q','x'};
        String s = new String(arr,1,3);
        System.out.println("s = "+s);
    }
    public static void stringConstructorDemo()
    {
        String s = new String();//等效于String s="";不等效String s = null;
        byte[] by = {65,66,67,68};
        String s1 = new String(by);
        System.out.println("s1="+s1);
    }
}
