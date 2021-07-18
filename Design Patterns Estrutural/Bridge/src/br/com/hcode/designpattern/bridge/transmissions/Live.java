package br.com.hcode.designpattern.bridge.transmissions;

import br.com.hcode.designpattern.bridge.platforms.IPlatform;

public class Live implements ITransmission{
    protected IPlatform platform;

    public Live(){

    }

    /* Entrará aqui o Youtube, Twitch e Facebook */
    public Live(IPlatform platform){
        this.platform = platform;
    }


    @Override
    public void broadcasting() {
        System.out.println("Iniciando transmissão!");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
