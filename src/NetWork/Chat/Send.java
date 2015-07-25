package NetWork.Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by online on 15-1-29.
 */
public class Send implements Runnable {
    private DatagramSocket ds;
    public Send(DatagramSocket ds){
        this.ds = ds;
    }
    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line =null;
        try {
            while ((line =br.readLine())!=null){
                if ("over".equals(line)){
                    byte[] but = line.getBytes();
                    DatagramPacket dp = new DatagramPacket(but,but.length, InetAddress.getByName("192.168.1.106"),1314);
                    ds.send(dp);
                    break;
                }
                byte[] but = line.getBytes();
                DatagramPacket dp = new DatagramPacket(but,but.length, InetAddress.getByName("192.168.1.106"),1314);
                ds.send(dp);
            }
        } catch (IOException e) {
            e.printStackTrace();
            ds.close();
        }

    }
}
