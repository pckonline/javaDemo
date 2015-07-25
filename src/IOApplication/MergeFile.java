package IOApplication;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by online on 15-1-25.
 */
public class MergeFile {
    public static void main(String[] args) throws IOException {
        File dir = new File("/home/online/文档/application");
        mergeFile_2(dir);

    }

    private static void mergeFile_2(File dir) throws IOException {

        //获取指定目录下的配置文件
        File[] files = dir.listFiles(new SuffixFilter(".properties"));
        if (files.length!=1){
            throw new RuntimeException(dir+"该目录下没有properties文件或者不唯一");
        }
        //记录配置文件
        File confile = files[0];
        //获取该文件中的信息
        Properties ps = new Properties();
        FileInputStream fis = new FileInputStream(confile);
        ps.load(fis);
        String filename = ps.getProperty("filename");
        int count = Integer.parseInt(ps.getProperty("partcount"));
//获取所有碎片文件
        File[] f2= dir.listFiles(new SuffixFilter(".part"));
        if (f2.length!=(count-1)){
            throw new RuntimeException("碎片文件不符合要求");
        }
        //将碎片文件和流对象关联并存储到集合中
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for (int i = 0;i<f2.length;i++){
            al.add(new FileInputStream(f2[i]));
        }
        //将多个流合并成一个序列流
        Enumeration<FileInputStream> en = Collections.enumeration(al);
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream(new File(dir,filename));

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();
        fis.close();
    }

    public static void mergeFile(File dir) throws IOException {
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for (int i = 1;i<=3;i++){
            al.add(new FileInputStream(new File(dir,i+".part")));
        }
        Enumeration<FileInputStream> en = Collections.enumeration(al);
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream(new File(dir,"1.txt"));

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();
    }
}
