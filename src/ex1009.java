// https://judge.beecrowd.com/en/problems/view/1009
import java.util.Scanner;

public class ex1009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double fixSalary = scanner.nextDouble();
        double sale = scanner.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", fixSalary+sale*0.15);
    }
}
