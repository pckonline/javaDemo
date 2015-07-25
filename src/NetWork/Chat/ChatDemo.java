package NetWork.Chat;


import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by online on 15-1-29.
 */
public class ChatDemo {
    public static void main(String[] args) throws SocketException {
        DatagramSocket send1 = new DatagramSocket();
        DatagramSocket rece1 = new DatagramSocket(1314);
        Send send = new Send(send1);
        Rece rece = new Rece(rece1);
        new Thread(send).start();
        new Thread(rece).start();
    }
}
