package IO_Stream.ByteSteam.File;

import java.io.File;

/**
 * Created by online on 15-1-24.
 */
public class FileTest {
    public static void main(String[] args) {
        File dir = new File("abc");
        listAll(dir,0);
    }

    private static void listAll(File dir,int le) {
        //获取指定目录下当前所有文件或者文件夹对象
        System.out.println(dir.getAbsolutePath());
        for (int i = 0;i<=le;i++){
            System.out.print("\t");
        }

        File[] f = dir.listFiles();

        for (File f1 :f){
            if (f1.isDirectory()){
                le++;
                listAll(f1,le);
            }
            else System.out.println(f1.getAbsolutePath());
        }
    }
}
