package otherAPI;

/**
 * Created by online on 15-1-22.
 */
public class MathDemo {
    public static void main(String[] args){
        /*
        Math:方法都是静态的，提供操作数学运算的方法。

        常用方法：
        abs()返回绝对值
        ceil():返回大于参数的最小整数
        floor()：返回小于参数的最大整数
        round()：四舍五入的整数

        pow(a,b):a的b次方
         */
        double d1 = Math.ceil(12.56);
        double d2 = Math.floor(12.56);
        double d3 = Math.round(12.56);
//        sop("d1="+d1);
//        sop("d2="+d2);
//        sop("d3="+d3);
//
//        double d4 = Math.pow(10,2);
//        sop("d4="+d4);

        for (int i = 0; i <10 ; i++) {
            double d = Math.round(Math.random()*10);
            System.out.println(d);
        }

    }

    private static void sop(String str) {
        System.out.println(str);
    }
}
