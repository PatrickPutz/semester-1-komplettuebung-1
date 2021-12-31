package org.campus02.oop;

public class CashPayment extends Payment{

    private String name;

    public CashPayment(double amount, String currency) {
        super(amount, currency);
        this.name = null;
    }

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    @Override
    public double calcTransactionCosts() {
        if(this.name == null){
            return 2.0;
        }
        else{
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Cash Payment: [" +
                "Amount: " + getAmount() +
                ", Currency: " + getCurrency() +
                ", Name: " + name +
                ", Transaction Costs: " + calcTransactionCosts() +
                ']';
    }

}
