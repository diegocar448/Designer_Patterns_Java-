package br.com.hcode.designpattern.adapter.payoneer;

import br.com.hcode.designpattern.adapter.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayments();
    void receivePayment();
}
