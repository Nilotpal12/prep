package lld.oopConcept;

public class Encapsulation {

    private double balance;

    public void deposit(double amount) {
        if(amount>0) balance += amount;

    }

    public double getBalance(){
        return balance;
    }
}
