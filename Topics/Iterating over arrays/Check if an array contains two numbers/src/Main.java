import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int element = scanner.nextInt();
            arr[i] = element;

        }
        boolean occurNextToEachOther = false;

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {    // i =0
            if (arr[i] == a && i == 0) {
                if (arr[i + 1] == b) {
                    occurNextToEachOther = true;
                    break;
                }
            }

            if (arr[i] == b && i == 0) {             // i=0
                if (arr[i + 1] == a) {
                    occurNextToEachOther = true;
                    break;
                }
            }

            if (arr[i] == a && i > 0 && i < arr.length-1) {
                if (arr[i + 1] == b || arr[i - 1] == b) {
                    occurNextToEachOther = true;
                    break;
                }
            }

            if (arr[i] == b && i > 0 && i < arr.length) {
                if (arr[i + 1] == a || arr[i - 1] == a) {
                    occurNextToEachOther = true;
                    break;
                }
            }

            if (arr[i] == a && i == arr.length - 1) {
                if (arr[i - 1] == b) {
                    occurNextToEachOther = true;
                    break;
                }
            }


        }
        System.out.println(occurNextToEachOther);
    }
}