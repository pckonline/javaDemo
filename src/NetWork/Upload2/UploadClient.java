package NetWork.Upload2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by online on 15-1-30.
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.106",1314);
        FileInputStream fis = new FileInputStream("/home/online/download/yell.jpg");
        OutputStream os = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf))!=-1){
            os.write(buf,0,len);
        }
        s.shutdownOutput();
        InputStream is  = s.getInputStream();
        byte[] bfIn = new byte[1024];
        int lenIn = is.read(bfIn);
        String str = new String(bfIn,0,lenIn);
        System.out.println(str);
        fis.close();
        s.close();
    }
}
