package NetWork.TCP;

import java.io.*;
import java.net.Socket;

/**
 * Created by online on 15-1-30.
 */
public class TransClient {
    public static void main(String[] args) throws IOException {
        /**
         * 客户端：
         * 1.需要先有Socket端点。
         * 2.客户端的数据源，键盘
         * 3.客户端的目的：socket。
         * 4.接收服务端的数据，源socket
         * 5.将数据显示打印出来，目的：控制台
         * 6.这些流中操作的数据，都是文本数据
         *
         * 转换客户端：
         * 1.创建Socket客户端对象
         * 2.获取键盘录入
         * 3.将录入的信息发送给socket输出流
         */
        //1.创建Socket客户端对象
        Socket s = new Socket("192.168.1.106",1314);
        //2.获取键盘录入

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //3.socket输出流
//        new BufferedWriter(new OutputStreamWriter(s.getOutputStream()) );
        PrintWriter out =new PrintWriter(s.getOutputStream(),true);
        System.out.println("haha3");
        //4.socket输入流读取服务端返回的大写数据
        BufferedReader brs = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("haha4");
        String line = null;
        while ((line = br.readLine())!=null){
            if ("over".equals(line)){
                break;
            }
            out.println(line);
            System.out.println("haha5");
            //读取服务端发回的一行大写数据
            String upperStr = brs.readLine();
            System.out.println(upperStr);
        }
        s.close();
    }
}
