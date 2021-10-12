package bai1;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;

public class server {
    public final static int serverPort = 15;

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
                    ch = is.read();
                    if (ch == 1) {
                        System.out.println(ch + ": mot");

                    } else if (ch == 2) {
                        System.out.println(ch + ": hai");

                    } else if (ch == 3) {
                        System.out.println(ch + ": ba");

                    } else if (ch == 4) {
                        System.out.println(ch + ": bon");

                    } else if (ch == 5) {
                        System.out.println(ch + ": nam");

                    } else if (ch == 6) {
                        System.out.println(ch + ": sau");

                    } else if (ch == 7) {
                        System.out.println(ch + ": bay");

                    } else if (ch == 8) {
                        System.out.println(ch + ": tam");
                        break;

                    } else if (ch == 9) {
                        System.out.println(ch + ": chin");

                    } else {
                        System.out.println(ch + ": khong xac dinh");

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
