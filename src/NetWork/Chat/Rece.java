package NetWork.Chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by online on 15-1-29.
 */
public class Rece implements Runnable {
    private DatagramSocket ds;
    public Rece(DatagramSocket ds){
        this.ds = ds;
    }
    @Override
    public void run() {
        while(true){

            byte[] buf  = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf,buf.length);
            try {
                ds.receive(dp);//阻塞式。
            } catch (IOException e) {
                e.printStackTrace();
            }
            String ip = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            String text = new String(dp.getData(),0,dp.getLength());
            System.out.println(ip+":"+port+":"+text);
            if (text.equals("over")){
                System.out.println(ip+"...退出聊天室");
            }
        }
    }
}
