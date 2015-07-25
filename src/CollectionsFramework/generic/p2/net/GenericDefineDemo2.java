package CollectionsFramework.generic.p2.net;

/**
 * Created by online on 15-1-15.
 */
public class GenericDefineDemo2 {
    public static void main(String[] args){
        Tool<String> to = new Tool<String>();

        to.show(new Integer(5));
        to.print("heihei");

        to.method(new Integer(8));
    }
}
