package IOStart.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class FileExceptionDemo {
    private static final String LINE_SEPARATOR =System.getProperty("line.separator") ;
    public static void main(String[] args)  {
        FileWriter fw = null;
        try {
            fw = new FileWriter("demo.txt");
            fw.write("xixi");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    finally {
            if (fw!=null)
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException("关闭失败");
            }
        }

    }

}
