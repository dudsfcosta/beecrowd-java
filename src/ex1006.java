// https://judge.beecrowd.com/en/problems/view/1006
import java.util.Scanner;

public class ex1006 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double Mp = (A*2 + B*3 + C*5)/(2+3+5);
        System.out.printf("MEDIA = %.1f\n", Mp);
    }
}