package NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by online on 15-1-28.
 */
public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        //获取其他主机的ip地址对象。
        ip = InetAddress.getByName("www.baidu.com");

        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }
}
