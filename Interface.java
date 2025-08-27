interface Payment {
    void makePayment(double amount);
}

class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Interface {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.makePayment(1000);

        Payment p2 = new UPI();
        p2.makePayment(500);
    }
}
