package IO_Stream.ByteSteam.transStream;

import java.io.*;

/**
 * Created by online on 15-1-23.
 *
 * 1.将键盘录入写入到文件中
 * 2.将一个文本文件显示到控制台上
 */
public class TransStreamDemo2 {
    public static void main(String[] args) throws IOException {

        demo_1();
    }

    private static void demo_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("ppToFile.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;
        while ((str = br.readLine())!=null){
            if ("over".equals(str))
                break;
            bw.write(str);
            bw.newLine();
            bw.flush();
        }

    }

    private static void demo_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ppToFile.txt")));
//这里的意思是，控制台输入的是字节 需要转换成字符（解码）进行操作，操作完后的字符串需要转换成字节（编码）进行字节存储
        String str = null;
        while((str = br.readLine())!=null){
            if("over".equals(str))
                break;
            bw.write(str.toUpperCase());
            bw.newLine();
            bw.flush();
        }
    }
}
