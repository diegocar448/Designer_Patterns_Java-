package br.com.hcode.designpattern.bridge.platforms;

public class Facebook implements IPlatform{

    public Facebook(){
        configureRMTP();
        System.out.println("Facebook : transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada!");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
