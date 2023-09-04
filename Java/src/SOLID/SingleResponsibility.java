package SOLID;

// A class should have only one reason to change, one responsibility

// Customer class responsible for managing customer account data
class Customer {
    private String name;
    private final String accountNumber;
    private double balance;

    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}

class NotificationService {
    // Other attributes and functions
    public void sendNotification(Customer customer, String message) {
        // Code for sending notifications (email, SMS, etc.)
        System.out.println("Notification sent to " + customer.getName() + ": " + message);
    }
}

class ReportService {
    // other attributes and functions
    public void generateFinancialReport(Customer customer) {
        // Generate the report based on the data
        System.out.println("Generating financial report for customer " + customer.getName());
        // ...
    }
}

public class SingleResponsibility {
    public static void main(String[] args) {
        Customer c= new Customer("Mostafa", "1254879", 320.5);

        NotificationService service1 = new NotificationService();

        service1.sendNotification(c,"Your deposit has arrived");
    }
}
