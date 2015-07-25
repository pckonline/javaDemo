package IOStart.Writer;


import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by online on 15-1-22.
 */
public class FIleTest2 {
    public static void main(String[] args)  {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter("demo.txt");
            fr = new FileReader("TEST.txt");
            int buff_size = 4096;
            //创建一个临时容器，存储读取的数据
            char[] buff = new char[buff_size];

            int len  = 0;
            //将数据读入到buff中
            while ((len = fr.read(buff))!=-1){
//                System.out.println(new String(buff,0,len));
                fw.write(buff,0,len);//将读取数据后buff数组写入到fw对象的文件中
            }
        }
        catch (Exception e){
            System.out.println("duxieshibai");
        }
        finally {
            if(fw!=null) try{
                fw.close();
            }catch (Exception e){

            }
            if(fr!=null) try{
                fr.close();
            }catch (Exception e){

            }
        }
    }
}
