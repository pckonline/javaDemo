package otherAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by online on 15-1-22.
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        String str_2 = "2015-2-19";
        String str_1 = "2015-1-22";
        test(str_2,str_1);
    }

    public static void test(String str_2, String str_1) throws ParseException {
        DateFormat df = DateFormat.getDateInstance();
        Date date1 = df.parse(str_1);
        Date date2 = df.parse(str_2);
        long l1=date2.getTime()-date1.getTime();

        long i = l1/1000/60/60/24;
        System.out.println(i);
    }
}
