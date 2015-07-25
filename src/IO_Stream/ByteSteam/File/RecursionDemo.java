package IO_Stream.ByteSteam.File;

import java.io.File;

/**
 * Created by online on 15-1-24.
 */
public class RecursionDemo {
    public static void main(String[] args) {
        /*
        递归：
        函数自身直接或者间接调用自身

        一个功能在被重复使用，且每次使用参与运算的结果和上依次调用有关。
        这时候可以用递归解决问题


        递归一定要明确条件
        否则容易栈溢出：
         */
        File f = new File("abc");
        deleteDir(f);
        f.delete();
    }

    private static void deleteDir(File f) {
        File[] f1 = f.listFiles();
        for (File f2:f1){
            if(f2.isDirectory()){
                deleteDir(f2);
                f2.delete();
            }
        }
    }

    public static void toBin(int num){
//        while (num>0){
//            System.out.println(num%2);
//            num = num/2;
//        }
        if (num>0){
        toBin(num/2);
        System.out.print(num % 2);
        }
    }
}
