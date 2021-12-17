import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] getFirstAndLast(int[] array) {
        int[] newArr = new int[2];
        newArr[0] = array[0];
        newArr[1] = array[array.length - 1];
        return newArr;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}