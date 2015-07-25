package NetWork.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by online on 15-1-29.
 */
public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        //客户端发数据到服务端
       /*
       Tcp传输，客户端的建立过程
       1.创建tcp客户端socket服务。使用的是Scoket对象
       建议该对象一创建就明确目的地（要连接的主机）。
        2.如果连接建立成功，就说明数据传输通道已建立。
        该通道就是socket流：
        是底层建立好的。
        既然是流，说明既有输入，又有输出。
        想要输入或者输出流对象 可以找Socket对象找到
        可以通过getOutputStream() , getInputStream来获得两个字节流。
        3.使用输出流，将数据写出。
        4.关闭资源
        */
    //创建客户端服务。
        Socket socket =new Socket("192.168.1.106",1314);
    //获取Socket流中的输出流。
        OutputStream os  = socket.getOutputStream();
        //使用输出流将指定的数据写出去
        os.write("TCP演示：来了".getBytes());

        //读取服务端返回的数据，使用Socket读取流
        InputStream is =socket.getInputStream();
        byte[] but=new byte[1024];
        int len = is.read(but);
        String str = new String(but,0,len);
        System.out.println("str:"+str);
        //关闭资源
        socket.close();
    }
}
