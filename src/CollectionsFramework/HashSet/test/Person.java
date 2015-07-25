package CollectionsFramework.HashSet.test;

import java.util.Comparator;

/**
 * Created by online on 15-1-14.
 */
public class Person implements Comparable /*extends Object */{
    private String name;
    private int age;

    public Person(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public Person() {
        super();
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
    public String toString(){
        return name+":"+age;
    }

    @Override
    public int compareTo(Object o) {
    Person p = (Person)o;
        int temp = this.age-p.age;
        return temp==0?this.name.compareTo(p.name):temp;
        //如果年龄相同，判断姓名排序

//        int temp = this.name.compareTo(p.name);
//        return temp==0?this.age-p.age:temp;
        //如果姓名排序相同，再判断年龄

//        if(this.age>p.age)
//            return 1;
//        if(this.age<p.age)
//            return -1;
//        else {
//
//            return this.name.compareTo(p.name);
//        }

    }
}
