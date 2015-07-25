package IO_Stream.ByteSteam.File;

import java.io.File;

/**
 * Created by online on 15-1-24.
 */
public class FileListDemo {
    public static void main(String[] args) {
        listDemo_2();
    }

    private static void listDemo_3() {
        //获取非隐藏文件或文件夹的名称
        File f = new File("/home/online");
        File[] fs = f.listFiles(new FilterByHidden());
        for (File f1 :fs){
            System.out.println(f1.getName());
        }
    }

    private static void listDemo_2() {
        File f = new File("/home/online/文档/javaDemo");
        String[] str = f.list(new FiterByJava(".txt"));
        //过滤器，在FiterByJava定义想要获得名称的文件
        for (String name : str){
            System.out.println(name);
        }

    }

    public static void listDemo() {
        File f = new File("/");

        /*
        获取当前目录下的文件的名称及隐藏文件
        调用的list方法的File对象封装的必须是目录 否则会是空指针数组

        如果目录存在但是没有内容，会返回一个数组，但是长度为0;
         */
        String[] str = f.list();
        for (String name : str){
            System.out.println(name);
        }
    }
}
