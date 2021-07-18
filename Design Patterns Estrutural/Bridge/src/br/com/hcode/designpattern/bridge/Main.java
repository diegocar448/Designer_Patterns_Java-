package br.com.hcode.designpattern.bridge;

import br.com.hcode.designpattern.bridge.platforms.Facebook;
import br.com.hcode.designpattern.bridge.platforms.IPlatform;
import br.com.hcode.designpattern.bridge.platforms.TwitchTV;
import br.com.hcode.designpattern.bridge.platforms.Youtube;
import br.com.hcode.designpattern.bridge.transmissions.AdvancedLive;
import br.com.hcode.designpattern.bridge.transmissions.Live;
import br.com.hcode.designpattern.bridge.transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(IPlatform platform){
        /*System.out.println("...Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        System.out.println("Transmissão avançada... aguarde");
        /*AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();*/

        RecordLive recordLive = new RecordLive(platform);
        recordLive.broadcasting();
        recordLive.broadcasting();
        recordLive.comments();
        recordLive.subtitles();
        recordLive.record();
        recordLive.result();

    }
}
