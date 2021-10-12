package vidu1TCP;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

public class server {
    public final static int serverPort = 7;

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("server da duoc tao");
            while (true) {
                try {
                    Socket s = ss.accept();
                    OutputStream os = s.getOutputStream();
                    InputStream is = s.getInputStream();
                    int ch = 0;
                    while (true) {
                        ch = is.read();
                        if (ch == -1)
                            break;
                        System.out.println((char) ch);
                        os.write(ch);

                    }
                    s.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("connect error :" + e);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("server creation error: " + e);
        }
    }

}
