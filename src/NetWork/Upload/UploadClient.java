package NetWork.Upload;

import java.io.*;
import java.net.Socket;

/**
 * Created by online on 15-1-30.
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.106",1314);
        BufferedReader bfr = new BufferedReader(new FileReader("client.txt"));
        //
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        String line = null;
        while ((line = bfr.readLine())!=null){
            pw.println(line);
        }
        //告诉服务端，客户端写完类
        s.shutdownOutput();
//        pw.println("over");
        BufferedReader bfIn= new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = bfIn.readLine();
        System.out.println(str);
        bfr.close();
        s.close();
    }
}
