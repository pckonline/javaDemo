package IOApplication;

import java.io.*;
import java.util.Properties;

/**
 * Created by online on 15-1-25.
 * 文件切割器
 */
public class SplitFileDemo {
    private static final int SIZE =1024*1024 ;

    public static void main(String[] args)throws IOException{
        //用读取流关联源文件
        File f = new File("/home/online/mp4.avi");
        splitFile_2(f);

    }

    private static void splitFile_2(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);

        byte[] buf = new byte[SIZE];

        FileOutputStream fos = null;

        int len = 0;
        int count=1;
        /*
        切割文件时，必须记录被切割的名称，以及切割出来的个数。以方便于合并。
        这个信息为了进行描述，使用键值对的方式，用到了Properties对象
         */

        Properties ps = new Properties();

        File dir = new File("/home/online/文档/application");
        if (!dir.exists()){
            dir.mkdir();
        }
        while ((len = fis.read(buf))!=-1){
            fos = new FileOutputStream(new File(dir,(count++)+".part"));
            fos.write(buf,0,len);
            fos.close();
        }
        //将被切割的文件的信息保存到prop集合中
        ps.setProperty("partcount",count+"");
        ps.setProperty("filename",file.getName());
        fos= new FileOutputStream(new File(dir,count+".properties"));

        //将prop集合中的数据存储到文件中
        ps.store(fos,"save file");
        fos.close();
        fis.close();
    }

    public static void splitFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);

        //定义一个3K的缓冲区
        byte[] buf = new byte[SIZE];

        FileOutputStream fos = null;
        File dir = new File("/home/online/文档/application");
        int len = 0;
        int count=1;
        while ((len = fis.read(buf))!=-1){
            fos = new FileOutputStream(new File(dir,(count++)+".part"));
            fos.write(buf,0,len);

        }
        fos.close();
        fis.close();
    }
}
