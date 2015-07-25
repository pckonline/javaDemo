package IO_Stream.ByteSteam.Properties;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by online on 15-1-24.
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        /*
        |--Map
            |--Hashtable
                |--Properties

        Properties集合：
        特点：
        1.该集合中的键和值都是字符串类型。
        2.集合中的数据可以保存到流中，或者从流中获取数据。

        通常该集合用于操作以键值对存在的配置文件
         */
        properties_4();
    }

    private static void properties_4() throws IOException {
        //读取文件
        File f = new File("pro.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);

        //创建集合
        Properties pt = new Properties();

        pt.load(fr);

        pt.setProperty("wangwu","16");

//        pt.list(System.out);

        FileWriter fw = new FileWriter(f);

        pt.store(fw,"s ");

        fr.close();
        fw.close();

        //将流中的数据存到集合中
    }
    /*
    对已有的配置文件信息进行修改。
    读取这个文件
    并将这个文件的键值数据存到集合中
    再通过集合对数据的修改;再将流修改后的文件存储到文件中
     */

    private static void properties_3() throws IOException {
        Properties pt = new Properties();
        //集合中的数据来自于一个文件
        //注意：必须要保证文件的数据是键值对
        //需要使用到读取流
        FileInputStream fs = new FileInputStream("pro.txt");
        //使用load方法
        pt.load(fs);
        pt.list(System.out);

    }

    private static void properties_2() throws IOException {
        Properties pt = new Properties();

        //存储元素
        pt.setProperty("zhangsan","30");
        pt.setProperty("lisi","32");
        pt.setProperty("wangwu","36");
        pt.setProperty("zhaoliu","31");
        FileOutputStream fos=new FileOutputStream("pro.txt");
        pt.store(fos,"nihao");
        //往文件中写入pt的数据元素
//        pt = System.getProperties();
        pt.list(System.out);
    }

    /*
    Properties集合的存取
     */
    public static void properties(){
        Properties pt = new Properties();

        //存储元素
        pt.setProperty("zhangsan","30");
        pt.setProperty("lisi","32");
        pt.setProperty("wangwu","36");
        pt.setProperty("zhaoliu","31");
        //取出所有的键
        Set<String> st = pt.stringPropertyNames();

        for (String st1:st){
            String str = pt.getProperty(st1);
            System.out.println(st1+":"+str);
        }
//        Iterator<String> it = st.iterator();
//        while (it.hasNext()){
//            String str = pt.getProperty(it.next());
//            System.out.println(str);
//        }
    }
}
