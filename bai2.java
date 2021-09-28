
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new 3Scanner(System.in);
        int so;
        System.out.println("nhap so can kiem tra ");

        so = sc.nextInt();
        if (isPrimeNumber(so) == true) {
            System.out.println("la so nguyen to ");
        } else
            System.out.println("khong la so nguyen to ");
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}