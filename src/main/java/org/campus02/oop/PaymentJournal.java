package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> payments;

    public PaymentJournal() {
        this.payments = new ArrayList<>();
    }

    public void add(Payment p){
        payments.add(p);
    }

    public double totalTransactionCosts(){
        double result = 0.0;

        for (Payment payment : payments) {
            result += payment.calcTransactionCosts();
        }

        return result;
    }

    public HashMap<String, Double> getPaymentsPerCurrency(){
        HashMap<String, Double> result = new HashMap<>();

        for (Payment payment : payments) {
            if(result.containsKey(payment.getCurrency())){
                double amount = result.get(payment.getCurrency());
                amount += payment.getAmount();
                result.put(payment.getCurrency(), amount);
            }
            else{
                result.put(payment.getCurrency(), payment.getAmount());
            }
        }

        return result;
    }
}
