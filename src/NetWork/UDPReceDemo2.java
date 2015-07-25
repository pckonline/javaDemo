package NetWork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by online on 15-1-28.
 */
public class UDPReceDemo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("接收端启动");
        /*
        建立UDP接收数据的思路。
        1.建立udp socket服务。因为要接收数据，必须要明确端口号
        2.创建数据包，用于存储接收到的数据。方便用数据包对象的方法解析这些数据
        3.使用socket 服务的receive方法将接收的数据存储到数据包中
        4.通过数据包的方法解析数据包中的数据
        5.关闭资源
         */
        //1.建立udp socket服务
        while(true){
        DatagramSocket ds = new DatagramSocket(10000);
//      2.创建数据包
        byte[] buf  = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);
        //3.使用接收方法将数据存储到数据包中
        ds.receive(dp);//阻塞式。
        //4.通过数据包对象的方法，解析其中的数据。比如地址，端口，数据内容
        String ip = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        String text = new String(dp.getData(),0,dp.getLength());
        System.out.println(ip+":"+port+":"+text);
        ds.close();
        }
    }
}
