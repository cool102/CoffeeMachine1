import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int candidate = scanner.nextInt();
            if (candidate == 0) {
                break;
            }
            System.out.println(candidate % 2 == 0
                    ? "even"
                    : "odd");


        }

    }
}