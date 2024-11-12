// https://judge.beecrowd.com/en/problems/view/1002
import java.util.Scanner;

import static java.lang.Math.pow;

public class ex1002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        double pi = 3.14159;
        double A = pi * pow(R, 2);
        System.out.printf("A=%.4f\n", A);
    }
}
