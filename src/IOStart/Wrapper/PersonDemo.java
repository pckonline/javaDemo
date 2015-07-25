package IOStart.Wrapper;

/**
 * Created by online on 15-1-22.
 */
public class PersonDemo {
    public static void main(String[] args){
    Person p = new Person();
        NewPeron p1 = new NewPeron(p);
        p1.chifan();
        NewPerson2 p2 = new NewPerson2();
        p2.chifan();
    }

}
class Person{
    void chifan(){
        System.out.println("吃饭");
    }
}
//这个类的出现是为了增强Person出现的
class NewPeron{

    private  Person p = new Person();
    NewPeron(Person p ){
        this.p = p;
    }
    public void chifan(){
        System.out.println("开胃");
        p.chifan();
        System.out.println("甜点");
    }
}
class NewPerson2 extends Person{
    public void chifan(){
        System.out.println("开胃");
        super.chifan();
        System.out.println("甜点");
    }
}
