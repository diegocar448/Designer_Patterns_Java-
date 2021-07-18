package br.com.hcode.designpattern.bridge.transmissions;


import br.com.hcode.designpattern.bridge.platforms.IPlatform;

public class RecordLive extends Live {

    public RecordLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na Transmissão!");
    }

    public void comments(){
        System.out.println("Comentários liberados na Live");
    }

    public void record(){
        System.out.println("Live Gravada!");
    }

}
