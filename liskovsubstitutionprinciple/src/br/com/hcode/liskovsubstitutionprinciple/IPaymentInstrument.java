package br.com.hcode.liskovsubstitutionprinciple;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPaymant();
}
