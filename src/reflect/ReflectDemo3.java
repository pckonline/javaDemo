package reflect;

import java.lang.reflect.Field;

/**
 * Created by online on 15-1-31.
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        getFieldDemo();
    }
    /**
     * 获取字节码文件的字段
     */
    public static void getFieldDemo() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class clazz = Class.forName("reflect.bean.Person");
        Field field = clazz.getDeclaredField("age");
        //对私有字段的访问取消权限检查.暴力访问
        field.setAccessible(true);
        Object obj = clazz.newInstance();
        field.set(obj,89);
        Object o =field.get(obj);
        System.out.println(o);
//        System.out.println(field);

    }
}
