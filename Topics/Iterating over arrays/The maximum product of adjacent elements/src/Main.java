import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int max = 0;

        if (arr.length == 2) {
            max = arr[0] * arr[1];
        }
        for (int i = 0; i < arr.length - 2; i++) {
            int previous = arr[i];
            int next = arr[i + 1];
            int subNext = arr[i + 2];
            int candidate = Integer.max(previous * next, next * subNext);
            if (candidate > max) {
                max = candidate;
            }
        }
        System.out.println(max);
    }

}
