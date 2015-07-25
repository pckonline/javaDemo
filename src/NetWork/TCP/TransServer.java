package NetWork.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by online on 15-1-30.
 */
public class TransServer {
    public static void main(String[] args) throws IOException {
        /**
         * 转换服务端
         * 分析：
         * 1.serverSocket服务
         * 2.获取socket服务
         * 3.源 socket  读取客户端发送的需要转换的数据
         * 4.目的：显示在控制台上
         * 5.将数据转成大写发给客户端
         */
        ServerSocket ss = new ServerSocket(1314);
        //2.获取Socket对象
        Socket s = ss.accept();
        //获取ip
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"已链接");
        //3.获取socket读取流，并装饰
        System.out.println("haha2");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //4.获取socket的输出流，并装饰
        System.out.println("haha1");
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        String line = null;
        while ((line = br.readLine())!=null){
            System.out.println(line);
            out.println(line.toUpperCase());
        }
        s.close();
        ss.close();
    }
}
