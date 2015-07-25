package NetWork;

import java.io.IOException;
import java.net.*;

/**
 * Created by online on 15-1-28.
 */
public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动");
        /*
        * 1.创建UDP传输的发送端
        * 思路：
        * 1.建立udp的socket服务
        * 2.将要发送的数据封装到数据包中。
        * 3.通过udp的socket服务将数据包发送过去
        * 4.关闭socket服务
        */
        //1.udpscoket服务，使用DatagramScoket对象。
        DatagramSocket ds = new DatagramSocket();

        //2.将要发送的数据封装到数据包中。
        String str = "udp传输演示：我来了";
        //使用DatagramPacket接收数据
        byte[] but = str.getBytes();
        DatagramPacket dp = new DatagramPacket(but,but.length, InetAddress.getByName("192.168.1.106"),1314);

        //3.通过udp的socket服务将数据包发送过去，使用send方法。
        ds.send(dp);
        //4.关闭资源
        ds.close();

    }
}
