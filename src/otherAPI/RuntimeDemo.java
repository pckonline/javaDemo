package otherAPI;

import java.io.IOException;

/**
 * Created by online on 15-1-22.
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        Runtime:没有构造方法摘要，说明该类不可以创建对象
        又发现还有非静态方法，说明该类应该提供静态的返回该类对象的方法。
        而且只有一个，说明Runtime使用单例设计模式。
         */

        Runtime run = Runtime.getRuntime();

        //execute:执行：xxx.exe

        Process p = run.exec("gcc ~/download/test.c");//当前路径下或者path中有的话会执行
        Thread.sleep(5000);
        p.destroy();
    }
}
