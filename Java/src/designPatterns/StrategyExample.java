package designPatterns;

interface Payment{
    void pay();
}

class Paypal implements Payment{
    @Override
    public void pay() {
        System.out.println("I'm paying with Paypal");
    }
}

class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("I'm paying with Credit card");
    }
}
class Fawry implements  Payment{
    @Override
    public void pay() {
        System.out.println("I'm paying with Fawry");
    }
}

class Store{
    private String[] products;
    private Payment paymentMethod;

    public Store(String[] products, Payment paymentMethod) {
        this.products = products;
        this.paymentMethod=paymentMethod;
    }
    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }
    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(){
        paymentMethod.pay();
    }
}

public class StrategyExample {
    public static void main(String[] args) {
        Payment payment= new Paypal();
        var store= new Store(new String[]{"Icecream", "Milk", "Meat"},payment);
        store.pay();

        Payment payment1= new CreditCard();
        store.setPaymentMethod(payment1);
        store.pay();
    }
}
