import java.util.Scanner;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (double i = 0; i <= 1000; i++) {
            if (((a * pow(i, 3)) + (b * pow(i, 2)) + (c * i) + d) == 0) {
                System.out.println((int)i);
            }

        }
    }
}