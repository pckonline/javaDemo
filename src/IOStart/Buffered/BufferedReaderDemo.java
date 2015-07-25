package IOStart.Buffered;

import java.io.*;

/**
 * Created by online on 15-1-22.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("buf.txt");
        BufferedReader bufr = new BufferedReader(fr);
        String line = null;
        while((line = bufr.readLine())!=null)
        System.out.println(line);
    }

    private static void demo_1() throws IOException {
        FileReader fr = new FileReader("buf.txt");
        char[] buf = new char[1024];
        int len = 0;
        while((len = fr.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        fr.close();
    }
}
