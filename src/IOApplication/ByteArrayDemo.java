package IOApplication;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by online on 15-1-26.
 */
public class ByteArrayDemo {
    public static void main(String[] args) {
        ByteArrayInputStream bis = new ByteArrayInputStream("abcdef".getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int ch = 0;
        while ((ch = bis.read())!=-1){
            bos.write(ch);
        }
        System.out.println(bos.toString());
    }
}
