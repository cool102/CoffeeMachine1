import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0; 
        do {
            int candidate = scanner.nextInt(); 
            if (candidate == 0) {
                break;
            }
            if (candidate > max) { 
                max = candidate;
            }

        }
        while (max != 0);

        System.out.println(max);
    }
}
