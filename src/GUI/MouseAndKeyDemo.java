package GUI;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by online on 15-1-28.
 */
public class MouseAndKeyDemo {
    private Frame f;
    private TextField tf;
    private Button bu;

    public MouseAndKeyDemo() {
        init();
    }

    private void init() {
        f = new Frame("演示鼠标和键盘监听");
        f.setBounds(400,200,500,400);
        f.setLayout(new FlowLayout());
        tf= new TextField(15);
        bu = new Button("一个按钮");
        f.add(bu);
        f.add(tf);

        myEvent();
        f.setVisible(true);
    }

    private void myEvent() {

        //给文本框添加键盘监听
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key run ..."+KeyEvent.getKeyText(e.getKeyCode())+"::"+e.getKeyCode());
                int code = e.getKeyCode();
                if (!(code >=KeyEvent.VK_0&&code<=KeyEvent.VK_9)){
                    System.out.println("必须是数字");
                    e.consume();
                }
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    System.out.println("enter run...");
                }

            }
        });

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //在按钮上添加一个鼠标监听器
        bu.addMouseListener(new MouseAdapter() {
            int count=0;
            @Override
            public void mouseEntered(MouseEvent e) {//鼠标放在上面就会执行下面的操作，类似于提示
//                System.out.println("mouse..."+(count++));
//                tf.setText("mouse..."+(count++));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
//                tf.setText("mouse..."+(count++));
                if (e.getClickCount()==2){
                    tf.setText("两次左键单击。。。"+count++);
                }
            }
        });
    }

    public static void main(String[] args) {

        new MouseAndKeyDemo();
    }
}
