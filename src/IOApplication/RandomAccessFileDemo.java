package IOApplication;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by online on 15-1-25.
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        /*
        RandomAccessFile:不是IO体系的子类
        特点：
        1.该对象既能读，又能写
        2.该对象内部维护了一个byte数组，并通过指针可以操作数组元素。
        3.可以通过getFilePointer方法获取指针的位置，和通过seek的方法设置指针的位置。
        4.其实该对象就是把字节输入输出流进行了封装。
        5.该对象的源或者目的只能是文件。通过构造函数就可以看出。

         */
//使用RandomAccessFile对象写入一些人员信息，比如姓名和年龄
//        writer();
//        reader();
    randomWrite();
    }

    public static void randomWrite()throws IOException{
        RandomAccessFile raf = new RandomAccessFile("random.txt","rw");
        raf.seek(3*7);
        raf.write("哈哈".getBytes());
        raf.write((byte)108);
    }
    private static void reader() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("random.txt", "r");
        raf.seek(1*7);
        byte[] buf = new byte[6];
        raf.read(buf);//6个字节，0-5
        String str=new String(buf);
        int age = raf.read();
        System.out.println(str+age);
        System.out.println(raf.getFilePointer());
        raf.close();
    }

    private static void writer() throws IOException {
//如果文件不存在，创建文件，若存在，不清空

        RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
        raf.write("张三".getBytes());
        raf.writeLong(97);
        byte[] buf = new byte[10];
        int len = 0;
        while ((len = raf.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }

        raf.close();
    }
}
