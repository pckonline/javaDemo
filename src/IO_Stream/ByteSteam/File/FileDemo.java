package IO_Stream.ByteSteam.File;

import java.io.File;

/**
 * Created by online on 15-1-23.
 */
public class FileDemo {
    public static void main(String[] args){
        constructorDemo();
    }

    public static void constructorDemo() {
        //可以将一个已存在的或者不存在的文件封装成File对象
        File f1 = new File("a.txt");

        File f2 = new File("/home/online/","a.txt");

        File f = new File("/home/online/");
        File f3 = new File(f,"a.txt");

        File f4 = new File("/"+File.separator+"home"+File.separator+"online"+File.separator+"a.txt");
        System.out.println(f4);
    }
}
