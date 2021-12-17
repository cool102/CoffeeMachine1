import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ten = scanner.nextInt();
        int eleven = scanner.nextInt();
        int minusTwo = scanner.nextInt();
        int minusThree = scanner.nextInt();

        System.out.printf("%d ", --ten);
        System.out.printf("%d ", --eleven);
        System.out.printf("%d ", --minusTwo);
        System.out.printf("%d ", --minusThree);
    }
}