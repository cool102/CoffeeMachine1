// write your answer here 

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println();
                System.out.println(sum);
                break;
            }
            sum = sum + number;
            if (sum >= 1000) {
                System.out.println();
                System.out.println(sum-1000);
                break;
            }

        }
    }
}
