import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int endOfLoop = -1;
        do {
            int term = scanner.nextInt();
            sum += term;
            endOfLoop = term;
        }
        while (endOfLoop != 0);
        System.out.println(sum);
    }
}