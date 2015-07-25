package NetWork.IEAndServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

/**
 * Created by online on 15-1-30.
 *
 */

//GET / HTTP/1.1  请求行，请求方式，/myweb/1.html 请求的资源路径 http协议版本
//请求消息头，属性名：属性值
//Host: localhost:2314
//Connection: keep-alive

//Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8


//User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36
//Accept-Encoding: gzip, deflate, sdch
//Accept-Language: zh-CN,zh;q=0.8

//请求体。请求头和请求体之间必须要有一个空行。

public class MyTomcat {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2314);
        Socket s = ss.accept();
        URL n1 =new URL("www.baidu.com");
        System.out.println(n1.getHost());
        System.out.println(s.getInetAddress().getHostName()+"来了");
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len =is.read(buf);
        String test = new String(buf,0,len);
        System.out.println(test);

        //给客户端一个反馈信息。
        PrintWriter out= new PrintWriter(s.getOutputStream(),true);
        out.println("welcome");
        s.close();
        ss.close();
    }
}
