import java.util.Scanner;

class Main {
    static String[] rotatedLink;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] notRotated = scanner.nextLine().split(" ");
        int rotations = scanner.nextInt();
        rotatedLink = notRotated;
        rotateSeveralTimes(rotatedLink, rotations);
        printRotatedSeveralTimesArray();

    }

    private static void printRotatedSeveralTimesArray() {
        for (String current : rotatedLink
        ) {
            System.out.print(current + " ");
        }
    }

    public static void rotate(String[] arr) {

        String[] rotated = new String[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            rotated[i + 1] = arr[i];
        }
        rotated[0] = arr[arr.length - 1];
        rotatedLink = rotated;
    }

    public static String[] rotateSeveralTimes(String[] arr, int rotations) {
        for (int i = 0; i < rotations; i++) {
           rotate(rotatedLink);
        }
        return rotatedLink;
    }
}