package faceToObject;

/*
关键字this的练习
当成员变量和局部变量重名，可以用关键字this区分
this：代表对象。那个对象？
     this就是所在函数所属对象的引用。
     简单说，哪个对象调用了this所在的函数，this就代表那个对象
 */

    class Person1
    {
        private int age;
        private String name;
        Person1(String name)
        {
            this.name = name;
        }
        Person1 (String name,int age)
        {
            this.name = name;
            //this(name);//提高数据的复用性，this可以用于构造函数中调用其他函数
            // 必须放在构造函数的第一行，因为初始化
            this.age = age;
        }
        void speak()
        {
            System.out.println(name+","+age);
        }
        public int compare(Person1 p)
        {
           if (this.age==p.age)
                return 1;
            else
                return 0;
        }

    }
/*
判断是否是同龄人
 */

 public class ThisDemo
 {
    public static void main(String[] args)
    {
        Person1 p1 = new Person1("旺财",18);
        //p1.speak();
        Person1 p2 = new Person1("旺旺",18);
        p1.compare(p2);
    }
 }
