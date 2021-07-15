package br.com.hcode.designpattern.adapter;

import br.com.hcode.designpattern.adapter.MercadoPago.MercadoPago;
import br.com.hcode.designpattern.adapter.adapters.MercadoPagoAdapter;
import br.com.hcode.designpattern.adapter.adapters.PayonnerAdapter;
import br.com.hcode.designpattern.adapter.payoneer.IPayoneerPayments;
import br.com.hcode.designpattern.adapter.payoneer.Payonner;
import br.com.hcode.designpattern.adapter.paypal.IPayPalPayments;
import br.com.hcode.designpattern.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
        //IPayPalPayments payment = new PayonnerAdapter(new Payonner());
        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());

        payment.paypalPayment();
        payment.paypalReceive();


        /*IPayoneerPayments payment = new Payonner();

        payment.sendPayments();
        payment.receivePayment();*/

        /*IPayPalPayments payment = new PayPal();

        payment.paypalPayment();
        payment.paypalReceive();*/
    }
}
