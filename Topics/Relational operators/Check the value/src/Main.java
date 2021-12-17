import java.util.Scanner;

class Main {
    private static final int VAL = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candidate = scanner.nextInt();
        System.out.println(candidate < VAL);
    }
}