package br.com.hcode.designpattern.abstractfactory.boats;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando viagem de barco");
    }

    @Override
    public void getCargo() {
        System.out.println("Tripulantes a bordo, iniciando viagem ");
    }


}
