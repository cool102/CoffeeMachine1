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
        int sum =0;
        for (int current:arr
             ) {
            sum +=current;

        }
        System.out.println(sum);
    }
}