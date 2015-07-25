package IMG;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by online on 15-2-2.
 */
public class ImgDemo {
    public static void main(String[] args) throws IOException {
            VerifyCode vc = new VerifyCode();
            BufferedImage bi = vc.getImage();
            VerifyCode.output(bi, new FileOutputStream("/home/online/xxx.jpg"));
            System.out.println(vc.getText());
        }
}
