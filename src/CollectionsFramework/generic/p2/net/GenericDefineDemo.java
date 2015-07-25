package CollectionsFramework.generic.p2.net;

/**
 * Created by online on 15-1-15.
 */
public class GenericDefineDemo {
    public static void main(String[] args){
//        Tool to = new Tool();
//        to.setObject(new Student());
//        Student st = (Student)to.getObject();
        Tool<Student> to = new Tool<Student>();

        to.setObject(new Student());//使用泛型后，当new的是Worker  编译会出错

        Student st = to.getObject();
    }
}
