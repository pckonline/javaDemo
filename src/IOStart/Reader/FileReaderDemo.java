package IOStart.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        /*
        1.创建读取字符数据对象;
        创建读取流文件的时候，必须要明确被读取的文件。一定要确保该文件存在
        用一个读取流关联一个已经存在的文件
         */
        FileReader fr = new FileReader("demo.txt");
        int ch = 0;
        while((ch = fr.read())!=-1)
        {
            System.out.println(ch);
        }

        //读取一个字符
//        int a = fr.read();
//        System.out.println(a);
//        int b = fr.read();
//        System.out.println((char)b);
//        int c = fr.read();
//        System.out.println(c);

        fr.close();

    }
}
