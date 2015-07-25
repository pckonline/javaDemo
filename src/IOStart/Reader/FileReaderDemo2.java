package IOStart.Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
/*
使用read(char[])读取文本文件数据。
先创建数组。
 */
        char[] arr  = new char[3];

        int len = 0;
        while((len = fr.read(arr))!=-1){
            System.out.println(new String(arr,0,len));
        }
//        int num = fr.read(arr);
//        System.out.println(num+":"+new String(arr,0,num));
//        int num1 = fr.read(arr);
//        System.out.println(num1+":"+new String(arr,0,num1));
//        int num2 = fr.read(arr);
//        System.out.println(num2+":"+new String(arr));
        fr.close();

    }
}
