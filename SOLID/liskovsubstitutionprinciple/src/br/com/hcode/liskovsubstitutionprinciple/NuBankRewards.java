package br.com.hcode.liskovsubstitutionprinciple;

public class NuBankRewards implements IPaymentInstrument{
    @Override
    public void validate() throws Exception {
        //validações
        System.out.println("Limite OK, Rewards OK!");
    }

    @Override
    public void collectPaymant() {
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Pontuação creditada no Programa Rewards!");
    }
}
