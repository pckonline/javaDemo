package IOApplication;

import java.io.IOException;

/**
 * Created by online on 15-1-26.
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {

        String str ="ab你好cd谢谢";
        int len = str.getBytes("gbk").length;
        for (int x= 0;x<len;x++){
            System.out.println("截取"+(x+1)+"的字符结果是："+cutStringByByte(str,x+1));
        }
    }
    public static String cutStringByByte(String str ,int len)throws IOException{
        byte[] buf = str.getBytes("gbk");
        int count = 0;
        for (int x = len-1;x>=0;x--){
            if (buf[x]<0){
                count++;
            }
            else break;
        }
        if (count%2==0)
            return new String(buf,0,len,"gbk");
        else return new String(buf,0,len-1,"gbk");
    }
}
