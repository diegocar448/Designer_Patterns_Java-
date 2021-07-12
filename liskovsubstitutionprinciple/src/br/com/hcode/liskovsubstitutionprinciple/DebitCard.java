package br.com.hcode.liskovsubstitutionprinciple;

public class DebitCard extends NuBankCard {


    @Override
    public void validate() throws Exception {

        System.out.println("Verificando Saldo!");
        System.out.println("Saldo disponível!");
    }
}
