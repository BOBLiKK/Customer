import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Customer[] customers = new Customer[7];
        Customer customer1 = new Customer(324234, "Bobov", "Gennadiy", "Urevich", "Wall str. 21", 21, 401);
        customers[0] = customer1;
        Customer customer2 = new Customer(324234, "White", "Walter", "Urevich", "Wall str. 40", 29, 402);
        customers[1] = customer2;
        Customer customer3 = new Customer(324234, "Vonka", "Villy", "Urevich", "Wall str. 45", 22, 403);
        customers[2] = customer3;
        Customer customer4 = new Customer(324234, "Fring", "Gustavo", "Urevich", "Wall str. 111", 24, 404);
        customers[3] = customer4;
        Customer customer5 = new Customer(324234, "Antonov", "Sergey", "Urevich", "Wall str. 3", 23, 405);
        customers[4] = customer5;
        Customer customer6 = new Customer(324234, "Vargo", "Nacho", "Urevich", "Wall str. 29", 212, 406);
        customers[5] = customer6;
        Customer customer7 = new Customer(324234, "Salamanca", "Hector", "Urevich", "Wall str. 211", 1, 407);
        customers[6] = customer7;

        Customers result = new Customers(customers);
        //result.printInfo();
        //System.out.println(Arrays.toString(customers));

        System.out.println("After Sorting:");

        result.sortCustomersAlphabetically();
        result.printInfo();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("With credit card in range:");
        System.out.println();

        result.findCustomersInRangeOfCreditCardNumbers(20, 29);
    }
}