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
        int min = arr[0];
        for (int candidate:arr
             ) {
            if(candidate<min){
                min =candidate;
            }

        }
        System.out.println(min);
    }
}