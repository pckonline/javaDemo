package NetWork.TCP;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by online on 15-1-29.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //服务端接收客户端发送过来的数据，并打印在控制台上
        /*
        建立tcp服务端
        1.创建服务端socket服务，ServerSocket对象
        2.服务端必须对外提供端口，否则客户端无法连接。
        3.获取连接过来的客户端对象。
        4。通过客户端对象获取socket流读取客户端发来的数据。
        并打印在控制台上
        5.关闭资源（2个），关客户端，关服务端
         */
        ServerSocket ss = new ServerSocket(1314);
        //2.获取连接过来的客户对象
        Socket socket  = ss.accept();
        String ip = socket.getInetAddress().getHostAddress();
        //3.通过socket对象获取输入流，要读取客户端发来的数据
        InputStream is = socket.getInputStream();
        byte[] but = new byte[1024];
        int len = is.read(but);
        String test = new String(but,0,len);
        System.out.println(ip+"server:"+test);
        //使用客户端Socket对象的输出流给客户端返回数据
        OutputStream os = socket.getOutputStream();
        os.write("收到".getBytes());

        socket.close();
        ss.close();
    }
}
