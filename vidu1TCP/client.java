package vidu1TCP;

import java.net.Socket;
import java.io.*;

public class client {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 7;

    public static void main(String[] args) throws InterruptedException, IOException {
        Socket s = null;
        try {
            s = new Socket(serverIP, serverPort);
            System.out.println("client da duoc tao");
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            for (int i = '0'; i <= 9; i++) {
                os.write(i);
                int ch = is.read();
                System.out.println((char) ch);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("error: can not create socket");
            // TODO: handle exception
        } finally {
            if (s != null) {
                s.close();
            }
        }

    }
}