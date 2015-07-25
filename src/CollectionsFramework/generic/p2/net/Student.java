package CollectionsFramework.generic.p2.net;

import CollectionsFramework.generic.bean.Person;

/**
 * Created by online on 15-1-15.
 */
public class Student extends Person {
    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }
    public String toString(){
        return "Student:"+getName()+getAge();
    }
}
