package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class PC {
    //Todos os fields de PC sao compostos para trazer varios atributos sem precisar utilizar Herança e sim usar a Composition
    private Case theCase; //theCase e uma variavel local de PC que contem a Classe CASE com seus atributos especificos como Model e afins
    private Monitor monitor;
    private Motherboard motherboard;
    //Construtor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    //Getters
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
