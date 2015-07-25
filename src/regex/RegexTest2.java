package regex;

/**
 * Created by online on 15-1-31.
 */

import java.io.*;
import java.net.URL;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网页爬虫：其实就是一个程序用于在互联网中获取符合指定规则的数据
 *
 * 爬取邮箱地址。
 *
 *
 */
public class RegexTest2 {
    public static void main(String[] args) throws IOException {
        HashSet<String> list = new HashSet<String>();
        list=getMails();
        int count=0;
        for (String mail:list){
            URL url = new URL("http://www.kurobas.com/"+mail);
            InputStream is = url.openStream();
            byte[] but = new byte[1024];
            int len = 0;
            FileOutputStream os = new FileOutputStream("/home/online/download/"+(++count)+".jpeg");
            while ((len =is.read(but))!=-1){
                os.write(but,0,len);
            }
            is.close();
            os.close();
            System.out.println(mail);
        }
    }
    public static HashSet<String> getMails() throws IOException {
        URL url = new URL("http://www.kurobas.com/character/");//连接一个网站
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));//获取网站源代码的字节流，并转换成字符流
        HashSet<String> hs = new HashSet<String>();
//        BufferedReader br = new BufferedReader(new FileReader("/"));
        String regex = "'/character.+?\\.jpg'";//正则语句
        Pattern p = Pattern.compile(regex);//将正则规则进行对象的封装。
        String line = null;
        while ((line = br.readLine())!=null){
            Matcher m = p.matcher(line);//通过正则规则对象获取匹配器
            while (m.find()){//操作
                String str1=m.group().replaceAll("'","");
                hs.add(str1);
            }
        }
        return hs;
    }
}
