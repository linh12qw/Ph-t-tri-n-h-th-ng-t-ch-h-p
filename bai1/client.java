package bai1;

import java.net.Socket;
import java.util.Scanner;
import java.io.*;

public class client {
    public final static String serverIP = "127.0.0.1";
    public final static int serverPort = 15;

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        Socket s = null;
        try {
            while (true) {
                s = new Socket(serverIP, serverPort);
                // System.out.println("client da duoc tao");

                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                System.out.println("nhap: ");
                int a = input.nextInt();

                os.write(a);
                Thread.sleep(500);

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