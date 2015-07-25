package IOStart.Buffered;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class BufferedWriterDemo {
    private static final String LINE_SEPARATOR =System.getProperty("line.separator") ;

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("buf.txt");
        //为了提高写入的效率。使用了字符流的缓冲区。
        //创建一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
        BufferedWriter bw = new BufferedWriter(fw);
        //使用缓冲区的刷新方法将数据刷到目的地
//        bw.write("abcde"+LINE_SEPARATOR+"ahahah");
//        bw.write("chak");
//        bw.newLine();
//        bw.write("haha");
        for (int i = 1; i <=4 ; i++) {
            bw.write("abcde"+i);
            bw.newLine();
            bw.flush();
        }

        bw.flush();
        //关闭缓冲区，其实就是关闭的流对象
        fw.close();

    }
}
