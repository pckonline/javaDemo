package NetWork.Upload2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by online on 15-1-30.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1314);
        while (true){
            Socket s = ss.accept();
            new Thread(new UploadTask(s)).start();

        }

    }
}
