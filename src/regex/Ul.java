package regex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * Created by online on 15-3-26.
 */
public class Ul {
    public static void main(String[] args) throws IOException {
        String crxAddress ="http://static.youku.com/v1.0.0531/v/swf/loader.swf";
        URL url = new URL(crxAddress);
        InputStream is = url.openStream();
        byte[] but = new byte[1024];
        int len = 0;
        File f = new File("/home/online/download/2.mp4");
        FileOutputStream os = new FileOutputStream(f);
        while ((len =is.read(but))!=-1){
            os.write(but,0,len);
        }
        is.close();
        os.close();
    }
}
