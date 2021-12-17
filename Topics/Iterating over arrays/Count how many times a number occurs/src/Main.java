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
        int counter=0;
        int candidate = scanner.nextInt();
        for (int current:arr
             ) {
            if (current == candidate){
                counter++;
            }

        }
        System.out.println(counter);
    }
}