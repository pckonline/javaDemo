package NetWork.Upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by online on 15-1-30.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1314);
        Socket s = ss.accept();
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("server.txt"));
        String line = null;
        while ((line = bufIn.readLine())!=null){
//            if ("over".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("上传成功");
        bw.close();
        s.close();
        ss.close();
    }
}
