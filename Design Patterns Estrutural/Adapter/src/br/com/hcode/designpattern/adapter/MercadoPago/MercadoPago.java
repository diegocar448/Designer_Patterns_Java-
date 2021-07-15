package br.com.hcode.designpattern.adapter.MercadoPago;

import br.com.hcode.designpattern.adapter.utils.Token;

public class MercadoPago implements IMercadoPago{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPaymentsMP() {
        System.out.println("Adaptando o MercadoPago utilizando os métodos padrões do PayPal");

    }

    @Override
    public void receivePaymentMP() {
        System.out.println("Recebendo pagamentos via MercadoPago");
    }
}
