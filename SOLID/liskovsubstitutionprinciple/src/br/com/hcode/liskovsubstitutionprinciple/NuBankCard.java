package br.com.hcode.liskovsubstitutionprinciple;

abstract public class NuBankCard implements IPaymentInstrument {

    @Override
    public void validate() throws Exception {
        //validação basica
    }

    @Override
    public void collectPaymant() {
        //pagamentorealizado
        System.out.println("Pagamento Realizado");
    }
}
