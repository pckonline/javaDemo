package IO_Stream.ByteSteam.Print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by online on 15-1-24.
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        1.提供了打印方法可以对多种数据类型进行打印，并保持数据的表示形式。
        2.它不抛IOException异常

        构造函数，接收三种类型的值。
        1.字符串路径
        2.File对象
        3.字节输出流
         */
        PrintStream ps = new PrintStream("print.txt");

        ps.write(609);//只写最低8位，意思为高位不读取，1001100001 和0001100001 打印出来的相同

//        ps.print(97);//先将97变成字符保持原样打印到目的地。
        ps.close();
    }
}
