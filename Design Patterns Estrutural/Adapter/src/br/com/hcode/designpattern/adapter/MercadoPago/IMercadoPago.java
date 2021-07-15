package br.com.hcode.designpattern.adapter.MercadoPago;

import br.com.hcode.designpattern.adapter.utils.Token;

public interface IMercadoPago {

    Token authToken();
    void sendPaymentsMP();
    void receivePaymentMP();
}
