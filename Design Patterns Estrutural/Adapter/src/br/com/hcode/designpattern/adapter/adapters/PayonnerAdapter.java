package br.com.hcode.designpattern.adapter.adapters;

import br.com.hcode.designpattern.adapter.payoneer.Payonner;
import br.com.hcode.designpattern.adapter.paypal.IPayPalPayments;
import br.com.hcode.designpattern.adapter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments {

    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner){
        this.payonner = payonner;
        System.out.println("Adaptando o Payonner utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayments();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
