package CollectionsFramework.generic.p2.net;

import CollectionsFramework.generic.bean.Person;

/**
 * Created by online on 15-1-15.
 */
public class Worker extends Person {
    public Worker() {
        super();
    }

    public Worker(String name, int age) {
        super(name, age);
    }
    public String toString(){
        return "Worker:"+getName()+getAge();
    }
}
