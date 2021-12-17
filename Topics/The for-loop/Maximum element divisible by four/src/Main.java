import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int lenght = scanner.nextInt();
        for (int i = 0; i < lenght; i++) {
            int candidate = scanner.nextInt();
            if (candidate % 4 == 0 && candidate > max) {
                max = candidate;
            }

        }
        System.out.println(max);

    }
}