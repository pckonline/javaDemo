package HelloWorld;

/**
 * Created by online on 15-2-5.
 */
public class Demo {
    public static void main(String[] args) {
        String flag = "fdsaiiialoijoalljkljaiohiohadddafffaffghahhh";
        String[] str = flag.split("a");
        String str1= "";
        for(int i =5;i<str.length;i++){
            str1+="a"+str[i];
        }
        System.out.println(str1);
    }
}
