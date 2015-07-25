package HelloWorld;

/*
数组:概念：同一种类型数据的集合，其实数组就是一个容器。
数组的好处：可以自动给数组中的元素从0开始编号，方便操作这些元素。
格式：元素类型【】数组名=new元素类型【元素个数或者数组长度】
内存的划分：1.寄存器  由CPU处理
2，本地方法区   所在系统处理
3,方法区
4,栈内存   重点
存储的都是局部变量，而且变量所处的作用域一旦结束，该变量就自动释放。（生命周期短，运行速度快）
//局部代码块，限定局部变量的生命周期。
5,堆内存   重点
存储的都是数组和对象，其实数组就是对象，凡是new建立的都在堆中。
特点：
1，每一个实体都有首地址值。
2，堆内存中每一个变量都有默认初始化值，根据类型的不同而不同。整数是0,小数是0.0或者0.0，boolean类型是false char ‘\u0000’
3,垃圾回收机制
 */
public class Anarrayof
{
    public static void main(String[] args) {
    /*
    {
        int[] arr = new int[100];
        arr[0]=89;
        System.out.println(arr[0]);
    }
    */
        int[] arr = new int[3];
        //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        // 当访问到数组中不存在的角标时就会发生儿该异常。
        //arr = null ;
        //System.out.println(arr[0]);//NullPointerException
        //空指针异常 当引用型没有任何实体指向时，还在用其操作实体，就会发生该异常。
        System.out.println(arr);//[I@15db9742   [I:实体的类型 【表示数组类型

    }
}
//对数组的最基本的操作就是存和取（对角标的操作）
//获取数组的长度：数组名.length