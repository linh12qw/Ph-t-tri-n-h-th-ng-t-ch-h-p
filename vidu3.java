public class vidu3 extends Thread {
    private Thread t;
    private String threadName;

    vidu3(String name) {
        threadName = name;

    }

    public void run() {

        try {

            for (int i = 1; i <= 100; i++) {
                int dem = 0;
                for (int j = 1; j <= 100; j++) {
                    if (i % j == 0)
                        dem++;
                }
                if (dem <= 2)
                    System.out.println(threadName + " " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public vidu3() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        vidu3 T1 = new vidu3("Thread_1");
        T1.start();

        vidu3 T2 = new vidu3("Thread_2");
        T2.start();

    }

}
