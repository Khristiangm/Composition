package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
//Extends torna a classe Car, filha da classe VEHICLE
public class Car extends Vehicle {
    //Apenas reforcando o conceito de Inheritance entre Vehicle e CAR
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
