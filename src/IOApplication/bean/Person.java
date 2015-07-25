package IOApplication.bean;

import java.io.Serializable;

/**
 * Created by online on 15-1-25.
 * Serializable:用于给被序列化的类加入ID号
 * 用于判断类和对象是否是同一个版本
 */
public class Person implements Serializable /*标记接口*/{
    //
    private static final long serialVersionUID = 95271;
    private  String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
