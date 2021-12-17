import java.util.Scanner;

class ManufacturingController {
    static int counter = 1;

    public static String requestProduct(String product) {

        product = counter + ". Requested " + product;
        return product;

    }

    public static int getNumberOfProducts() {
        return counter++;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());

        }


    }
}