package UseObject;

/**
 * Created by online on 14-12-4.
 */

/**
 * StringBuffer就是字符串缓冲区
 * 用于存储数据的容器
 * 特点：
 * 1.长度可变的
 * 2.可以存储不同的数据类型
 * 3.最终要转成字符串进行使用
 * 4.可以对字符串进行修改。
 *
 *
 * 既然是一个容器 ， 应该具备什么功能？
 *1.添加
 *      StringBuffer append(data)
 *      StringBuffer insert(int index,data)
 *2.删除
 *      StringBuffer delete(int start,int end):包含头，不包含尾
 *      StringBuffer deleteCharAt(int index):删除指定位置的元素
 *3.查找
 *      char charAt(index)
 *      int indexOf(String)
 *      int lastIndexOf(String)
 *      StringBuffer replace(start , end , String)
 *      void setCharAt  (index,char)
 *增删查改
 *      C(create)U(update)R(read)D(delete)
 *
 */
public class StringBufferDemo
{
    public static void main(String[] args)
    {
        bufferMethodDemo2();
    }
    public static void bufferMethodDemo2()
    {
        StringBuffer tb = new StringBuffer("abcd");

        //tb.delete(1,3);
        //清空缓冲区
//        tb.delete(0,tb.length());
//        tb.replace(1,3,"haha");
//        tb.setCharAt(1,'h');
//        tb.setLength(0);
        System.out.println(tb.reverse());
    }
    public static void bufferMethodDemo1()
    {
        StringBuffer tb = new StringBuffer("ahaa");
        //tb.append("xixi");
        tb.insert(2,"yao");
        System.out.println(tb.toString());
    }
    public static void bufferMethodDemo()
    {
        //创建缓冲对象
        StringBuffer tb = new StringBuffer();
        tb.append(4).append(false);//.append("haha");
        tb.insert(1,"haha");
        //tb.append(true);
        System.out.println(tb);

    }
}
