import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfcompanies = scanner.nextInt();
        double[] incomes = new double[countOfcompanies];
        for (int i = 0; i < incomes.length; i++) {
            int income = scanner.nextInt();
            incomes[i] = income;
        }

        for (int i = 0; i < incomes.length; i++) {
            double tax = scanner.nextDouble();
            tax = tax / 100;
            incomes[i] = incomes[i] * tax;
        }

        double maxTax = incomes[0];
        int maxTaxIdx = 1;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] > maxTax) {
                maxTax = incomes[i];
                maxTaxIdx = i+1;
            }
        }
        System.out.println(maxTaxIdx);
    }
}