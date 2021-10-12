package vidu2TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public final static int serverPort = 3000;

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Server da duoc tao");
            while (true) {
                try {
                    Socket s = ss.accept();
                    request rp = new request(s);
                    rp.start();

                } catch (IOException ie1) {
                    // TODO: handle exception
                    System.out.println("Connect Error: " + ie1);
                }
            }
        } catch (IOException ie) {
            // TODO: handle exception
            System.out.println("Server creation Error: " + ie);
        }
    }

}
