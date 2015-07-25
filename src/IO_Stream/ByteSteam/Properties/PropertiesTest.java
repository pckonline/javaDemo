package IO_Stream.ByteSteam.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by online on 15-1-24.
 *
 * 定义功能，获取一个应用程序的运行的次数，如果超过5次，给出使用的次数已到，请购买正版的提示
 * 1.思路：
 *  有一个计数器：每一次启动程序在原有的数加1
 * 2.计数器就是一个变量，程序启动时进行计数，计数器必须存在内存中进行计数
 *  程序结束，计数器消失了，那么再次启动该程序时，计数器又重新被初始化了。
 *  而我们需要多次启动一个程序，使用同一个计数器
 *  这就需要计数器的生命周期变长，从内存中存储到硬盘中
 *
 *  3.如何使用这个计数器
 *  首先，程序启动时，应该先读取这个用于记录计数器信息的配置文件
 *  获取上一次的计数器次数
 *  其次，对该计数器进行自增，并将自增后的次数重新存储到配置文件中。
 *4.文件中的信息该如何进行存储并体现？
 * 直接存储数值可以，但是不明确该数据的含义，起名字比较重要
 * 这就有了名字和值的对应，所以可以使用键值对
 *
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
    getAppCount();
    }
    public static void getAppCount() throws IOException {
        File f= new File("count.properties");
        if (!f.exists()){
            f.createNewFile();
        }
        FileInputStream fis = new FileInputStream(f);
        Properties pt  = new Properties();
        pt.load(fis);

        String value = pt.getProperty("time");

        int count = 0;
        if(value!=null){
            count = Integer.parseInt(value);
            if (count>5){
//                System.out.println("使用次数已到");
                throw new RuntimeException();
            }
        }
        count++;
        pt.setProperty("time",count+"");

        FileOutputStream fos = new FileOutputStream(f);
        pt.store(fos,"");

        pt.list(System.out);
        fos.close();
        fis.close();
    }
}
