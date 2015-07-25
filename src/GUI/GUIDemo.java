package GUI;

import sun.plugin2.os.windows.Windows;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by online on 15-1-28.
 * 几个常见的方法
 */
public class GUIDemo  {
    public static void main(String[] args) {
        Frame f = new Frame("my frame");
//        f.setLocation(400,150);//所在位置，距离左  距离右
//        f.setSize(500,400);//横向长度，纵向长度
        f.setBounds(400,150,500,400);//距离左  距离右  横向长度，纵向长度
        f.setLayout(new FlowLayout());//设置流式布局
        Button but  =new Button("一个按钮");//创建一个按钮对象

        f.add(but);//在窗口中加入按钮

        f.addWindowListener(new WindowAdapter() {//窗口监听
            @Override
            public void windowClosing(WindowEvent e) {
//                System.out.println("closeing...."+e);
                System.exit(0);
            }
        });
        //在按钮上加上一个监听
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        f.setVisible(true);//创建一个可视化窗体
        System.out.println("over");
    }
}
