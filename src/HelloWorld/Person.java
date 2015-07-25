package HelloWorld;

/**
 * Created by online on 14-11-20.
 */
public class Person
{
    private int age;
    private String name;
    public Person()
    {
    }
    public Person(String name,int age)
    {
        this.name=name;
        this.age  =age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int age)
    {
        this.name = name;
    }
    public int getAge()
    {
        return this.age;
    }
}
