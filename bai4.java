import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {

        int sum = 0, number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so:  ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++)
            sum += i;
        System.out.println("Tổng = " + sum);

    }
}
