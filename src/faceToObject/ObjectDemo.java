package faceToObject;

import java.util.ArrayDeque;

/*
Object:所有类的根类。
Object是不断抽取而来的，具备所有对象都具有的共性内容。

常用的共性功能：
 */
/*
class Fu2//extends Object
{
    Fu2()
    {
        super();
    }
}
class Zi2 extends Fu2
{
    Zi2()
    {
        super();
    }
}
*/
class Work1
{
    private int age;
    Work1(int age)
    {
        this.age = age;
    }
    /*
    一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否相同的依据。
     */
    public boolean equals(Object obj)//相当于Object obj = w2  把w2转型提升为Object型 隐藏w2特有属性
    {
        if(!(obj instanceof Work1))
        {
            //return false;
            throw new ClassCastException("类型错误");
        }
        else
        {
        Work1 p = (Work1)obj; //相当于把obj转型成Work1型  恢复w2的特有属性
        return this.age==p.age;
        }
    }

    public int hashCode()
    {
        return age;
    }


}

//比较Work1的年龄，是否是同龄人
public class ObjectDemo
{
    public static void main(String[] args) {
        Work1 w2 = new Work1(20);
        Work1 w1 = new Work1(20);
        Class clazz1= w1.getClass();
        Class clazz2 = w2.getClass();
        //System.out.println(w1.equals(w2));
        System.out.println(w1);
        //System.out.println(w1.hashCode());
        //System.out.println(clazz1==clazz2);
        //Work1 w3 =w1;
        //System.out.println(w1 == w2);
        //System.out.println(w1.equals(w3));
    }
}
