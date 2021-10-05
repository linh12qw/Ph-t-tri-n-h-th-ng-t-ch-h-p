class vidu2 extends Thread {
    public static void main(String args[]) {
        new vidu2A().start();
        new vidu2B().start();
    }
}