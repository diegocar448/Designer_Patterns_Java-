package br.com.hcode.dependencyinversionprinciple;

import br.com.hcode.dependencyinversionprinciple.payment.Payment;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}
