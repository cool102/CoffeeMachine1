import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < 3; i++) {
            int side = scanner.nextInt();
            box1[i] = side;
        }
        for (int i = 0; i < 3; i++) {
            int side = scanner.nextInt();
            box2[i] = side;
        }

        Arrays.sort(box1);
        Arrays.sort(box2);
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < 3; i++) {
            if (box1[i] > box2[i]) {
                counterA++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (box2[i] > box1[i]) {
                counterB++;
            }
        }

        System.out.println(counterA == 3 ? "Box 1 > Box 2" : counterB == 3 ? "Box 1 < Box 2" : "Incompatible");

    }
}