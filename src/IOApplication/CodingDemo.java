package IOApplication;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by online on 15-1-26.
 */
public class CodingDemo {
    public static void main(String[] args) throws IOException {
        demo_1();
    }

    private static void demo_1() throws IOException {
        String str = "你好";
        byte[] buf = str.getBytes("gbk");
        for (Byte bu:buf){
            System.out.println(bu);
        }
        String str_1=new String(buf,"utf-8");
        System.out.println(str_1);
        byte[] buf_1  = str_1.getBytes();
        for (Byte bu_1:buf_1){
            System.out.println(bu_1);
        }
        String str_2=new String(buf,"gbk");
        System.out.println(str_2);
    }
}
