
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class docfile extends Thread {
    String tenFile;

    public docfile(String tenFile) {
        super();
        this.tenFile = tenFile;
    }

    public void run() {
        try {
            File f = new File(tenFile);
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

    public static void main(String[] args) {
        docfile t1 = new docfile("D:\\myfile.txt");
        t1.start();
        docfile t2 = new docfile("D:\\myfile2.txt");
        t2.start();
        docfile t3 = new docfile("D:\\myfile2.txt");
        t3.start();

    }

}
