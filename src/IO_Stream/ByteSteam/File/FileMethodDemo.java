package IO_Stream.ByteSteam.File;




import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;


/**
 * Created by online on 15-1-23.
 */
public class FileMethodDemo {
    public static void main(String[] args) throws IOException {
        /*
        File对象的方法
        1.获取
            1.1 获取文件名称
            1.2 获取文件路径
            1.3 获取文件大小
            1.4 获取文件修改时间
        2.创建与删除

        3. 判断

        4. 重命名
         */
//        getDemo();
//        createAndDeleteDemo();
//        isDemo();
//        renametTODemo();
        listRootsDemo();
    }

    private static void listRootsDemo() {
        File[] files =  File.listRoots();
        for (File file:files){
            System.out.println(file);
        }
    }

    private static void renametTODemo() {
        File f1 = new File("demo.txt");

        File f2 = new File("demo2.txt");
        System.out.println(f1.renameTo(f2));

    }

    public static void isDemo() throws IOException {
        File f3  = new File("demo.txt");

//        System.out.println(f3.exists());
        //最好先判断是否存在

        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());

    }

    public static void createAndDeleteDemo() throws IOException {
        //文件夹的创建和删除
        File f1 = new File("abc/fsa/fsa/fdfd/des");
        f1.mkdirs();//创建多级目录

//        System.out.println(f1.mkdir());
//        System.out.println(f1.delete());

        //文件的创建和删除
//        File f2 = new File("demo.txt");

        /*
        和输出流不一样，如果文件不存在，则创建，如果文件存在，不创建
         */
//        boolean b = f1.createNewFile();
//        System.out.println(b);

//        boolean b1= f1.delete();
//        System.out.println(b1);
    }


    private static void getDemo() {
        File f1 = new File("demo.txt");//相对路径
        File f2 = new File("/home/online/文档/javaDemo/demo.txt");//绝对路径

        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.length());
        System.out.println(f1.lastModified());
        Date d = new Date(f1.lastModified());
        System.out.println(d);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG);
        String str = df.format(d);
        System.out.println(str);
    }



}
