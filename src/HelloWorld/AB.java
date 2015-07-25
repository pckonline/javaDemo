package HelloWorld;

import java.util.ArrayList;
import java.util.List;

class AB{
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        list.add("fahk1");
        list.add("fahk3");
        list.add("fahk4");
        list.add("fahk2");
        for (String li:list){
            System.out.println(li);
        }
    }
}