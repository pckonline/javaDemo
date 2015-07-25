package IOStart.Buffered;

import java.io.*;

/**
 * Created by online on 15-1-22.
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("buf.txt");

        BufferedReader bufr = new BufferedReader(fr);

        FileWriter fw = new FileWriter("buf1.txt");
        BufferedWriter bufw = new BufferedWriter(fw);
        String str = null;
        while((str = bufr.readLine())!=null)
        {
            bufw.write(str);
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();
    }
}
