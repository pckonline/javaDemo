package IOApplication;

import IOApplication.bean.Person;

import java.io.*;

/**
 * Created by online on 15-1-25.
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//    writeObj();
        readObj();

    }

    private static void readObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.object"));
        Person obj = (Person)ois.readObject();
        System.out.println(obj.getName()+obj.getAge());
    }

    private static void writeObj() throws IOException {

        //将对象持久化
        //对象必须要实现Serializable接口
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.object"));
        oos.writeObject(new Person("小强",30));
        oos.close();

    }

}
