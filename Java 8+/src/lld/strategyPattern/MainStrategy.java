package lld.strategyPattern;

public class MainStrategy {

    public static void main(String[] args) {
        PaymentService service = new PaymentService(new UPIPayment());

        service.processPayment(200);

        service = new PaymentService(new CreditCardPayment());

        service.processPayment(365);
    }
}
