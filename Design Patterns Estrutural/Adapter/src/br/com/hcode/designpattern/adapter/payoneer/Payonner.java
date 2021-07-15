package br.com.hcode.designpattern.adapter.payoneer;


import br.com.hcode.designpattern.adapter.utils.Token;

public class Payonner implements IPayoneerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayments() {
        System.out.println("Enviado pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payonner");
    }
}
