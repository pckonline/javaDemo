package NetWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by online on 15-1-28.
 */
public class UDPSendDemo2 {
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
//        String str = "udp传输演示：我来了";
        //使用DatagramPacket接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line =null;
        while ((line =br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            byte[] but = line.getBytes();
            DatagramPacket dp = new DatagramPacket(but,but.length, InetAddress.getByName("192.168.1.106"),10000);
            ds.send(dp);
        }



        //3.通过udp的socket服务将数据包发送过去，使用send方法。

        //4.关闭资源
        ds.close();

    }
}
