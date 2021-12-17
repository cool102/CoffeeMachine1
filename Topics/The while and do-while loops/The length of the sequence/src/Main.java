import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNextInt()) {
            int candidate = scanner.nextInt();
            if (candidate == 0) {
                break;
            }
            if (candidate != 0 && candidate > max) {
                max = candidate;
            } else {
            }

        }
        System.out.println(max);


    }
}