package IOStart.Buffered;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class MyBufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("buf.txt");

        MyBufferedReader mbr = new MyBufferedReader(fr);

        String s = null;
        while ((s = mbr.myReadLine())!=null){//由于myReadLine()是读取的从开始到换行的一段字符串
            System.out.println(s);
        }
        mbr.close();
    }
}
