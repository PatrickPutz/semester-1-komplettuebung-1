package org.campus02.oop;

public class CreditCardPayment extends Payment{

    private String cardNumber;
    private String securityNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }

    @Override
    public double calcTransactionCosts() {
        if(getCurrency().equals("EUR")){
            return (0.5 + getAmount() * 0.011);
        }
        else{
            return (1.5 + exchangeToEUR() * 0.0275);
        }
    }

    @Override
    public String toString() {
        return "Creditcard Payment: [" +
                "Amount: " + getAmount() +
                ", Currency: " + getCurrency() +
                ", Card Number: " + cardNumber +
                ", Security Number: " + securityNumber +
                ", Transaction Costs: " + calcTransactionCosts() +
                ']';
    }
}
