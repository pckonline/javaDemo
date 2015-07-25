package IOStart.Buffered;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by online on 15-1-22.
 *
 * 自定义的读取缓冲区，其实就是模拟一个BufferedReader
 *
 * 分析：缓冲区中无非就是封装了数组
 * 并对外提供了更多的方法对数组进行访问
 * 其实这些方法操作的是数组的脚标
 *
 * 缓冲的原理：
 * 其实就是从源中获取一堆数据装进缓冲区中
 * 再从缓冲区中不断的提取一个一个数据
 * 但此次取完后,再从源中继续取一批数据进缓冲区
 * 当源中数据完全取完后，用-1作为结束标记
 */
public class MyBufferedReader extends Reader {
    private Reader fr;
    //定义一个数组作为缓冲区
    private char[] buf = new char[1024];
    //定义一个指针用于操作数组中的元素。当操作到最后一个元素后，指针应该归零
    private int chs = 0;
    //定义一个计数器用于记录缓冲区的个数，当该数据减到0时，就从 源中继续获取元素
    private int bus = 0;

    public  MyBufferedReader(Reader fr){
        this.fr = fr;
    }
    public int myRead() throws IOException {
//1.从源中获取一批数据到缓冲区,只有计数器为0时才需要从源中获取数据

        if (bus == 0){
            bus = fr.read(buf);//自带的read()是往buf里读入字符数据，有几个字符 bus就是几
            chs=0;
        }
        if (bus<0){
            return -1;
        }
        char ch = buf[chs++];
        bus--;
        return ch;

    }
    public String myReadLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while((ch = myRead())!=-1){//ch等于-1的情况是文件中没有字符数据了
            if (ch=='\r')
                continue;
            if(ch=='\n')
                return sb.toString();
        sb.append((char)ch);
        }
        if(sb.length()!=0)
        {
            return sb.toString();
        }
        return null;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    public void close() throws IOException {
        fr.close();
    }
}
