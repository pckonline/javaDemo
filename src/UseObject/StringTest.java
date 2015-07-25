package UseObject;

import javax.swing.border.Border;

/**
 * Created by online on 14-12-4.
 */
/*
两个字符串中最大的相同子串
"qwerabcdtyuiop"
"xcabcdvbn"
思路：
1.既然取得的最大子串，先看短的那个字符串是不是在长的字符串中。
如果存在，短的那个字符串就是最大子串。
2.如果不是，那就将短的那个字符串进行长度递减的方式去子串，去长字符串判断是否存在
如果存在，就不用再找了。
 */
public class StringTest
{
    public static void main(String[] args)
    {
        String s1 = "qwerabcdtyuiop";
        String s2 = "qweraabcdtyvbn";
        String s = getMaxSubstring(s1,s2);
        System.out.println(s);
    }
    //获取最大子串
    public static String getMaxSubstring(String s1 , String s2)
    {
        String max = null;
        String min =null;
        max = (s1.length()>s2.length())?s1:s2;
        min = (max.equals(s1))?s2:s1;
        for(int i = 0 ; i<min.length();i++)
        {
            for(int a = 0,b = min.length()-i;b<min.length()+1;a++,b++)
            {
                String sub = min.substring(a,b);
                if(max.contains(sub))
                    return sub;
            }
        }
        return null;
    }
}
