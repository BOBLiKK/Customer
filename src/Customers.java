import java.util.Arrays;

public class Customers {

    private int amount;
    Customer[] customers;

    public Customers(int size){
        this.amount = size;
        customers = new Customer[amount];
        for(int i = 0; i < customers.length; i++){
            customers[i].initialize();
        }
    }

    public Customers(Customer[] ourCustomers){
        this.amount = ourCustomers.length;
        customers = new Customer[amount];

        for(int i = 0; i < this.amount; i++){
            this.customers[i] = ourCustomers[i];
        }
    }

    public void sortCustomersAlphabetically(){

        int pos;
        Customer temp = new Customer();

        for(int i = 0; i < customers.length; i++){
            pos = i;
            for(int j = i + 1; j < customers.length; j++){
                if(customers[j].getSurname().compareTo(customers[pos].getSurname()) < 0){
                    pos = j;
                }
            }
            temp = customers[pos];
            customers[pos] = customers[i];
            customers[i] = temp;
        }
    }

    public void findCustomersInRangeOfCreditCardNumbers(int rangeStart, int rangeFinish){

        for(int i = 0; i < this.amount; i++){
            if(customers[i].getCreditCardNumber() >= rangeStart && customers[i].getCreditCardNumber() <= rangeFinish){
                customers[i].prtintClientsInformation();
            }
        }
    }

    public void printInfo(){
        for(int i = 0; i < this.amount; i++){
            customers[i].prtintClientsInformation();
        }
    }
}
