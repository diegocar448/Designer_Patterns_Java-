package br.com.hcode.designpattern.adapter.paypal;

import br.com.hcode.designpattern.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
