package IOStart.Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class FIleTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw  = new FileWriter("demo.txt");

        FileReader fr = new FileReader("TEST.txt");

        int ch = 0;
        while ((ch =fr.read() )!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
