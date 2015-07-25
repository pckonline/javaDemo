package IO_Stream.ByteSteam.ByteStream;

import java.io.*;

/**
 * Created by online on 15-1-22.
 */
public class ByteStreamTest {
    public static void main(String[] args)throws  IOException{
        copy_1();
    }
//千万别使用
    private static void copy_4() throws IOException {
        FileInputStream fis = new FileInputStream("/home/online/mp4.avi");

        FileOutputStream fos = new FileOutputStream("/home/online/mp41.avi");

        int ch = 0;
        while ((ch = fis.read())!=-1){
            fos.write(ch);
        }
        fos.close();
        fis.close();

    }

    //不建议
    private static void copy_3() throws IOException {
        FileInputStream fis = new FileInputStream("/home/online/mp4.avi");

        FileOutputStream fos = new FileOutputStream("/home/online/mp41.avi");
        byte[] bt = new byte[fis.available()];//较好的读入格式
        fis.read(bt);
        fos.write(bt);
        fos.close();
        fis.close();
    }

    private static void copy_2() throws IOException{
        FileInputStream fis = new FileInputStream("/home/online/mp4.avi");
        BufferedInputStream bfis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("/home/online/mp41.avi");
        BufferedOutputStream bfos = new BufferedOutputStream(fos);

        int ch = 0;
        while((ch = bfis.read())!=-1){
            fos.write(ch);
        }
        bfos.close();
        bfis.close();
    }

    private static void copy_1() throws IOException{
        FileInputStream fis = new FileInputStream("/home/online/mp4.avi");

        FileOutputStream fos = new FileOutputStream("/home/online/mp41.avi");
        byte[] bt = new byte[1024];//较好的读入格式
        int len = 0;
        while((len = fis.read(bt))!=-1){
            fos.write(bt,0,len);
        }
        fos.close();
        fis.close();
    }
}
