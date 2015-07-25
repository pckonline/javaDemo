package reflect.bean;

/**
 * Created by online on 15-1-31.
 */
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("person run"+this.name+":"+this.age);
    }

    public Person() {
        super();
        System.out.println("person run no");
    }
    public void show(){
        System.out.println("name..show run"+age);
    }
    private void method(){
        System.out.println("method ...run");
    }
    public void paramMethod(String str,int num){
        System.out.println("paramMethod..."+str+"..."+num);
    }
    public static void staticMethod(){
        System.out.println("static method run");
    }
}
