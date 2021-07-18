package br.com.hcode.designpattern.bridge.platforms;

public class Youtube implements IPlatform{
    public Youtube(){
        configureRMTP();
        System.out.println("Youtube : transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: configurando broadcasting!");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicação");
    }
}
