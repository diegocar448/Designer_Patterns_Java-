package br.com.hcode.designpattern.builder;

import br.com.hcode.designpattern.builder.builders.CarBuilder;
import br.com.hcode.designpattern.builder.builders.MuscleCarBuilder;
import br.com.hcode.designpattern.builder.builders.TruckBuilder;
import br.com.hcode.designpattern.builder.cars.Car;
import br.com.hcode.designpattern.builder.cars.MuscleCar;
import br.com.hcode.designpattern.builder.cars.Truck;
import br.com.hcode.designpattern.builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        //criando caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhão: " + truck.result());


        //criando muscleCar
        MuscleCarBuilder muscleCarBuilder = new MuscleCarBuilder();
        director.constructMuscleCar(muscleCarBuilder);

        MuscleCar muscleCar = muscleCarBuilder.getResult();
        System.out.println(muscleCar.result() + " produzido com sucesso!");

    }
}
