package IO_Stream.ByteSteam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by online on 15-1-24.
 *
 * 获取指定目录下，指定扩展名的文件（包含子目录）
 * 这些文件的绝对路径写入到一个文本文件中
 * 简单说，就是建立一个指定扩展名的文件的列表
 *
 * 思路：
 * 1.进行深度遍历。
 * 2.要在遍历的过程中进行过滤。将符合条件的内容都存储到容器中。
 * 3.对容器中的内容进行遍历并将绝对路径写入到文件中。
 */
public class IOTest {
    public static void main(String[] args) {
        File f = new File("abc");
        List<File> list = new ArrayList<File>();
        FilenameFilter ff = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        };
        getFile(f,ff,list);

        File f2 = new File("dest.txt");
        writeToFile(list,f2);
    }
    //指定路径，指定过滤器，指定容器
    public static void getFile(File dir,FilenameFilter filter ,List<File> list){
     File[] file = dir.listFiles();
        for (File f1 :file){
            if (f1.isDirectory()){
                getFile(f1,filter,list);
            }
            else {
                if (filter.accept(dir, f1.getName())){
                    list.add(f1);
                }
            }
        }
    }
    public static void writeToFile(List<File> list,File destFile)  {
    BufferedWriter bw = null;
        try {
             bw = new BufferedWriter(new FileWriter(destFile));
            for (File f:list){
                bw.write(f.getAbsolutePath());
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("写入失败");
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }
        }
    }
}
