package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by online on 15-1-31.
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        getMethodDemo_1();
    }

    public static void getMethodDemo_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName("reflect.bean.Person");
        Method method = clazz.getMethod("show",null);//获取空参数一般方法
//        Object obj = clazz.newInstance();
        Constructor con = clazz.getConstructor(int.class,String.class);
        Object obj = con.newInstance(20,"xiaoqiang");
        method.invoke(obj,null);
    }

    /**
     * 获取指定Class中的公共函数
     */
    public static void getMethodDemo() throws ClassNotFoundException {
        Class clazz = Class.forName("reflect.bean.Person");

        Method[] method = clazz.getMethods();//获取的都是共有的方法
        method = clazz.getDeclaredMethods();
        for (Method me :method){

            System.out.println(me);
        }
    }
}
