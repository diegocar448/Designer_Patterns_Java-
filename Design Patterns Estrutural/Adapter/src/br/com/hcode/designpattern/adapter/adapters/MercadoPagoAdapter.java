package br.com.hcode.designpattern.adapter.adapters;

import br.com.hcode.designpattern.adapter.MercadoPago.MercadoPago;
import br.com.hcode.designpattern.adapter.payoneer.Payonner;
import br.com.hcode.designpattern.adapter.paypal.IPayPalPayments;
import br.com.hcode.designpattern.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {

    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o MercadoPago utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPaymentsMP();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receivePaymentMP();
    }
}
