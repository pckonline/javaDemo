package reflect;

import reflect.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by online on 15-1-31.
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        createNewObject_2();
    }

    public static void createNewObject_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 当获取指定名称对应类中的所体现的对象时
         * 而该对象初始化不使用空参数构造该怎么办呢？
         * 既然是通过指定的构造函数进行对象的初始化，
         * 所以应该先获取到该构造函数，通过字节码文件对象即可
         * 该方法是：getConstructor(paramterTypes);
         */
        Class clazz = Class.forName("reflect.bean.Person");
        //获取到指定的构造函数
        Constructor con =  clazz.getConstructor(int.class,String.class);
        //通过该构造器对象的newInstance方法进行对象的初始化。
        Object obj = con.newInstance(39,"xiaoqiang");
        System.out.println(obj.toString());
    }
    public static void createNewObject_1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //早期   new的时候先根据被new的类的名称找寻该类的字节码文件，并加载进内存，并创建该字节码文件对象并接着创建字节码文件对应的Person对象
//        reflect.bean.Person p=new reflect.bean.Person();
        //现在：
        String name = "reflect.bean.Person";
        //找寻该名称类文件，并加载进内存，并产生Class对象
        Class clazz = Class.forName(name);//运行了Person字节码文件
        //如何产生该类的对象
        Object obj = clazz.newInstance();//读取该字节码文件后，对该字节码文件中的类进行实例化，但是只能是Object  后需要强转
        Person p = (Person)obj;
        p.show();
    }
}
