package br.com.hcode.designpattern.builder.cars;

import br.com.hcode.designpattern.builder.components.CarType;
import br.com.hcode.designpattern.builder.components.Color;
import br.com.hcode.designpattern.builder.components.Engine;
import br.com.hcode.designpattern.builder.components.Transmission;

public class MuscleCar {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public MuscleCar(
            CarType carType,
            int seats,
            Engine engine,
            Transmission transmission
    ){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        String muscle = "Muscle with motor: " + engine.getPower() + "\n";
        muscle += " Transmission: " + transmission;

        return muscle;
    }
}
