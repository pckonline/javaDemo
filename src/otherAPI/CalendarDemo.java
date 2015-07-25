package otherAPI;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;

/**
 * Created by online on 15-1-22.
 */
public class CalendarDemo {
    public static void main(String[] args){
        Calendar c=  Calendar.getInstance();

        c.set(2012,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);//对当前的c日期进行偏移
        shwoDate(c);
    }

    private static void shwoDate(Calendar c) {

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
    }
}
