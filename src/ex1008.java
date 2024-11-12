// https://judge.beecrowd.com/en/problems/view/1008
import java.util.Scanner;

public class ex1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hrs = scanner.nextInt();
        double amount = scanner.nextDouble();

        System.out.printf("NUMBER = %d\n", num);
        System.out.printf("SALARY = U$ %.2f\n", hrs*amount);
    }
}
