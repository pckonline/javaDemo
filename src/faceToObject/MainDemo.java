package faceToObject;

/*
public static void main(String[] args)
主函数的特殊
格式是固定的
被jvm所识别和调用
public:因为权限是最大的
static：不需要对象。直接用主函数所属类名调用即可
void：主函数没有具体的返回值。
main：函数名 不是关键字，只是一个jvm识别的固定的名字。
String[]：这是主函数的参数列表，是一个数组类型的参数，而且元素都是字符串类型。
 */
class Person3
{
    private int age;
    private String name;
    public static String country="CN";
    public Person3(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void show()
    {
        System.out.println(country+":"+name+":"+age);
    }
    public static void method()
    {
        System.out.println(Person3.country);
    }
}
public class MainDemo
{
    public static void main(String[] args)// 相当于new String[0]
    {
        //System.out.println(args);//[Ljava.lang.String;@7f31245a
        //System.out.println(args.length);
        Person3.method();
        Person3 p = new Person3("豆豆",20);
        p.show();
    }
}

