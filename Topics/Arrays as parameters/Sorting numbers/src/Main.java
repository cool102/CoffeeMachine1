import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isSorted = false;

    public static void sort(int[] numbers) {

        do {
            isSorted = true;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i-1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i-1];
                    numbers[i-1] = tmp;
                    isSorted = false;
                }
            }
        }
        while (!isSorted);

    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}