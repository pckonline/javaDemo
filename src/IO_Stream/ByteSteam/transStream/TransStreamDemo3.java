package IO_Stream.ByteSteam.transStream;

import java.io.*;


public class TransStreamDemo3 {
    public static void main(String[] args) throws IOException {


        readTest_2();
    }

    private static void readTest_2() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("uni.txt"),"unicode");
        char[] buf = new char[10];
        int len = 0;
        while((len = isr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));

        }
        isr.close();
    }

    private static void readTest_1() throws IOException {
        FileReader fr = new FileReader("u8_1.txt");
        char[] buf = new char[10];
        int len = 0;
        while((len = fr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));

        }
        fr.close();
    }

    private static void writerTest_3() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("uni.txt"),"unicode");
        osw.write("你好");
        osw.close();
    }

    private static void writerTest_2() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_1.txt"),"GBK");
        osw.write("你好啊");
        osw.close();
        /*
        这两种输出流是等同的，
        FileWriter:其实就是转换流指定本机默认码表的体现
        而且这个转换流的子类对象，可以方便操作文本文件
        简单说就是：操作文件的字节流加本机默认的编码表
         */
    }

    public static void writerTest_1() throws IOException {
        FileWriter fw = new FileWriter("gbk.txt");
        fw.write("你好");
        fw.close();
    }
}
