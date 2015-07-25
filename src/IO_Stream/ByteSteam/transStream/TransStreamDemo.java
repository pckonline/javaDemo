package IO_Stream.ByteSteam.transStream;

import java.io.*;

/**
 * Created by online on 15-1-23.
 */
public class TransStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节流
//        InputStream in = System.in;
//        //字符流
//        InputStreamReader isr = new InputStreamReader(in);
//
//        BufferedReader br = new BufferedReader(isr);
              //字符流
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //字节流
//        OutputStream out = System.out;
////字符流
//        OutputStreamWriter osw = new OutputStreamWriter(out);
//        BufferedWriter bw = new BufferedWriter(osw);
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;
        while((str = br.readLine())!=null){
            if("over".equals(str))
                break;
//            System.out.println(str.toUpperCase());
//            osw.write(str.toUpperCase());
//            osw.flush();
            bw.write(str.toUpperCase());

            bw.newLine();bw.flush();
        }
    }
}
