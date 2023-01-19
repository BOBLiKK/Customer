import java.util.Scanner;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String fathersName;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(){
        this.id = 0;
        this.surname = "";
        this.name = "";
        this.fathersName = "";
        this.address = "";
        this.creditCardNumber = 0;
        this.bankAccountNumber = 0;
    }

    public Customer(int id, String surname, String name, String fathersName, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void initialize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Set id:");
        setId(sc.nextInt());
        System.out.println("Set surname:");
        setSurname(sc.nextLine());
        System.out.println("Set name:");
        setName(sc.nextLine());
        System.out.println("Set father's name:");
        setFathersName(sc.nextLine());
        System.out.println("Set address:");
        setAddress(sc.nextLine());
        System.out.println("Set credit card number:");
        setCreditCardNumber(sc.nextInt());
        System.out.println("Set bank account number:");
        setBankAccountNumber(sc.nextInt());
    }

    public void prtintClientsInformation(){
        System.out.println("Client's information:");
        System.out.println("Client's id: " + getId());
        System.out.println("Client's surname: " + getSurname());
        System.out.println("Client's name: " + getName());
        System.out.println("Client's father's name: " + getFathersName());
        System.out.println("Client's address: " + getAddress());
        System.out.println("Client's credit card number: " + getCreditCardNumber());
        System.out.println("Client's bank account number: " + getBankAccountNumber());
        System.out.println();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Customer customer)) {
            return false;
        }

        if (getId() != customer.getId()) {
            return false;
        }
        if (getCreditCardNumber() != customer.getCreditCardNumber()) {
            return false;
        }
        if (getBankAccountNumber() != customer.getBankAccountNumber()) {
            return false;
        }
        if (getSurname() != null ? !getSurname().equals(customer.getSurname()) : customer.getSurname() != null) {
            return false;
        }
        if (getName() != null ? !getName().equals(customer.getName()) : customer.getName() != null) {
            return false;
        }
        if (getFathersName() != null ? !getFathersName().equals(customer.getFathersName()) : customer.getFathersName() != null) {
            return false;
        }
        return getAddress() != null ? getAddress().equals(customer.getAddress()) : customer.getAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getFathersName() != null ? getFathersName().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + getCreditCardNumber();
        result = 31 * result + getBankAccountNumber();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
