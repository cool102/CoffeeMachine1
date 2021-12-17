import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atLeast = scanner.nextInt();
        int noMore = scanner.nextInt();
        int actual = scanner.nextInt();
        boolean isDeficiency = actual < atLeast;
        boolean isExcess = actual > noMore;
        boolean isNormal = actual >= atLeast && actual <= noMore;
        if (isDeficiency) {
            System.out.println("Deficiency");
        } else if (isExcess) {
            System.out.println("Excess");
        } else if (isNormal) {
            System.out.println("Normal");
        }
    }
}
