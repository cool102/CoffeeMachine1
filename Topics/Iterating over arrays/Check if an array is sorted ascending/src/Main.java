import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int[] arr = new int[lenght];
        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        boolean isBroken = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isBroken = true;
                break;
            }
        }

        System.out.println(isBroken
                ? "false"
                : "true");

    }
}