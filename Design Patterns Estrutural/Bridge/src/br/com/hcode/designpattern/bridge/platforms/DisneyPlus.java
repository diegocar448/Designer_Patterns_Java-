package br.com.hcode.designpattern.bridge.platforms;

public class DisneyPlus implements IPlatform{

    public DisneyPlus(){
        configureRMTP();
        System.out.println("DisneyPlus: streaming started");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Autorizada!");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando App");
    }
}
