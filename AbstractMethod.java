abstract class Payment {
    // abstract method (each payment has its own way)
    abstract void makePayment(double amount);

    // concrete method (common for all)
    void paymentDone() {
        System.out.println("Payment completed successfully!");
    }
}

class CreditCardPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    @Override
    public String toString() {
        return "CreditCardPayment []";
    }
}

class UpiPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.makePayment(1000);
        p1.paymentDone();

        Payment p2 = new UpiPayment();
        p2.makePayment(500);
        p2.paymentDone();
    }
}
