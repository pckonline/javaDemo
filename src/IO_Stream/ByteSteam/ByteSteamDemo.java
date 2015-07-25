package IO_Stream.ByteSteam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class ByteSteamDemo {
    public static void main(String[] args) throws IOException {
        demo_read();
    }

    private static void demo_read() throws IOException {
        FileInputStream fis = new FileInputStream("bytedemo1.txt");

//        byte[] buf = new byte[fis.available()];
//        fis.read(buf);
//        System.out.println(new String(buf));

        byte[] by = new byte[1024];
        int len = 0;
        while((len = fis.read(by))!=-1 ){
            System.out.println(new String(by,0,len));
        }

//        int i = fis.read();
//        System.out.println(i);
//        int i = 0;
//        while ((i = fis.read())!=-1){
//            System.out.println((char)i);
//        }
        fis.close();
    }

    private static void demo_write() throws IOException {
        //1.创建字节输出流对象。用于操作文件
        FileOutputStream fo = new FileOutputStream("bytedemo1.txt");
//      写数据，直接写到文件中
        fo.write("abcde".getBytes());
        fo.close();//关闭资源东西是需要的，但是不需要flush();
    }
}
