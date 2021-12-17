import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int countOfBridges = scanner.nextInt();
        int[] arr = new int[countOfBridges];
        for (int i = 0; i < countOfBridges; i++) {
            int bridgeHight = scanner.nextInt();
            arr[i] = bridgeHight;
        }
        System.out.println(crushOrNot(busHeight,arr));
    }

    private static String crushOrNot(int busHeight, int[] arr) {
        int bridgeNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= busHeight) {
                bridgeNumber = i + 1;
                return "Will crash on bridge " + bridgeNumber;
            }
        }
        return "Will not crash";
    }
}