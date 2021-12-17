import java.util.Scanner;

class Main {
    private static final int CHECK_VAL = 20;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (a + b == CHECK_VAL
               || a + c == CHECK_VAL
               || b + c == CHECK_VAL) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
