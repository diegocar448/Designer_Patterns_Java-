package br.com.hcode.liskovsubstitutionprinciple;

public class CreditCard extends NuBankCard {


    @Override
    public void validate() throws Exception {
        /* Validação do cartão de crédito  */
        System.out.println("Validando Limite!");
        System.out.println("Limite OK!");
    }
}
