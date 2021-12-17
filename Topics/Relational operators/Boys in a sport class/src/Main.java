import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean cupsOfWeekDay = cups >= 10 && cups <= 20;
        boolean cupsOfWeekEnd = cups >= 15 && cups <= 25;
        boolean isHappy = cupsOfWeekDay && !isWeekend || cupsOfWeekEnd && isWeekend;
        System.out.println(isHappy);


    }
}

