package lld.strategyPattern;

public class UPIPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Payed : "+amount+" with UPIPayment");
    }
}
