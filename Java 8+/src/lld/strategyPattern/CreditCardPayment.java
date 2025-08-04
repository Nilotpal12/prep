package lld.strategyPattern;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Payed : "+amount+" with CreditCard");
    }
}
