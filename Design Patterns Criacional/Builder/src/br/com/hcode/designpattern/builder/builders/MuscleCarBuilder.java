package br.com.hcode.designpattern.builder.builders;

import br.com.hcode.designpattern.builder.cars.MuscleCar;
import br.com.hcode.designpattern.builder.cars.Truck;
import br.com.hcode.designpattern.builder.components.CarType;
import br.com.hcode.designpattern.builder.components.Engine;
import br.com.hcode.designpattern.builder.components.Transmission;

public class MuscleCarBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public MuscleCar getResult(){
        return new MuscleCar(carType, seats, engine, transmission);
    }
}
