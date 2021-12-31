package org.campus02.oop;

public class MaestroPayment extends Payment{

    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {
        if((exchangeToEUR() * 0.0075) < 0.95){
            return 0.95;
        }
        else{
            return (exchangeToEUR() * 0.0075);
        }
    }

    @Override
    public String toString() {
        return "Maestro Payment: [" +
                "Amount: " + getAmount() +
                ", Currency: " + getCurrency() +
                ", Card Number: " + cardNumber +
                ", Transaction Costs: " + calcTransactionCosts() +
                ']';
    }
}
