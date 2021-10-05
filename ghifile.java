
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ghifile extends Thread {
    String tenFile;

    public ghifile(String tenFile) {
        super();
        this.tenFile = tenFile;
    }

    public void run() {

        FileOutputStream fos = null;
        File file;
        int numberOfCharactor = 20;
        random rand = new random();
        String mycontent = "BÀI TẬP THỰC HÀNH bai 1_ VUThiLinh 170140001 \r\n" + "Day so ngau nhien: "
                + rand.randomAlphaNumeric(numberOfCharactor);
        try {
            file = new File(tenFile);
            fos = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bytesArray = mycontent.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }
    }

    public static void main(String[] args) {
        ghifile t1 = new ghifile("D:/myfile.txt");
        t1.start();
        ghifile t2 = new ghifile("D:/myfile2.txt");
        t2.start();
        ghifile t3 = new ghifile("D:/myfile3.txt");
        t3.start();

    }
}
