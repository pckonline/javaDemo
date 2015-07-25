package IOStart.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class FileWriterDemo {
    private static final String LINE_SEPARATOR =System.getProperty("line.separator") ;

    public static void main(String[] args) throws IOException {
        /*创建一个可以往文件中写入字符的字符输出流对象
        既然是往一个文件中写入文字数据，那么在创建对象时，就应该明确该文件（用于存储数据的目的地）

        如果文件不存在，则会自动创建
        如果文件存在  那么文件会被覆盖

        如果构造函数中加一个true，可以实现对文件的续写
         */
        FileWriter fw = new FileWriter("/home/online/demo.txt");

        /*
        调用Writer对象中的write(String)方法写入数据。

        其实数据写入到临时缓冲区中
         */
//        fw.write("afafad"+LINE_SEPARATOR+"sfa");
        fw.write("xixi");

        /*
        进行刷新，将数据直接写入到目标中
         */
//        fw.flush();

//        关闭流，关闭资源
        fw.close();
    }

}
