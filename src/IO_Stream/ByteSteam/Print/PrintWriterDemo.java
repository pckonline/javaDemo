package IO_Stream.ByteSteam.Print;

import java.io.*;

/**
 * Created by online on 15-1-24.
 * PrintWriter 字符打印流
 * 构造函数：1.字符串路径
 *          2.File对象
            3.字节输出流
            4.字符输出流
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(new FileWriter("print.txt"),true);
        String line =null;
        while ((line = bw.readLine())!=null){
            if("over".equals(line)){
                break;
            }
            pw.println(line);
        }
        pw.close();
        bw.close();
    }
}
