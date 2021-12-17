import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candidate = scanner.nextInt();
        boolean range1 = candidate > -15 && candidate <= 12;
        boolean range2 = candidate > 14 && candidate < 17;
        boolean range3 = candidate >= 19;
        String trueOrFalse = range1 || range2 || range3
                ? "True"
                : "False";

        System.out.println(trueOrFalse);
    }
}