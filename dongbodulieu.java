import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.SynchronousQueue;

public class dongbodulieu implements Runnable {
    File f = new File("D:\\\\data.txt");

    public dongbodulieu() {
        // TODO Auto-generated constructor stub
    }

    public synchronized void DOC() {
        try {
            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            fr.close();
            br.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }

    public synchronized void GHIFILE() {
        try {

            FileWriter fw = new FileWriter(f);
            fw.write("Vũ Thị Linh_17014001" + "Bài tập tuần 3");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

    @Override
    public void run() {

        if (f.exists()) {
            System.out.println("tim thay file!\n");
            DOC();
        } else {
            System.out.println("chưa có file: tạo mới!\n");
            GHIFILE();
            try {
                Thread.sleep(500);
                DOC();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        dongbodulieu t = new dongbodulieu();
        Thread t1 = new Thread(t);
        t1.start();
    }

}
