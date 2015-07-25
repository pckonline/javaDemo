package NetWork.Upload2;

import java.io.*;
import java.net.Socket;

/**
 * Created by online on 15-1-30.
 */
public class UploadTask implements Runnable {
    private Socket s;

    public UploadTask(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            int count = 0;
            String ip = s.getInetAddress().getHostAddress();
            InputStream is = s.getInputStream();
            File dir = new File("/home/online/download");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File file = new File(dir, ip + ".jpg");
            while (file.exists()){
                file = new File(dir,ip+"("+(++count)+")"+".jpg");
            }
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = is.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
            OutputStream os = s.getOutputStream();
            os.write("上传成功".getBytes());
            fos.close();
            s.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }

    }
}
