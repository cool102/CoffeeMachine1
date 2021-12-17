import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt(); //4
        int counter = 0; //4
        for (int i = 1; i <= numberOfElements; i++) {  //4
            if (counter == numberOfElements) {
                break;
            }
            for (int j = 1; j <= i; j++) {             //2<=2
                System.out.print(i + " ");               //1223
                counter++;
                if (counter == numberOfElements) {
                    break;
                }
            }

        }
    }
}