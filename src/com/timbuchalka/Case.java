package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Case {
    //Fields da classe Gabinete
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;
    //Construtor da Classe Gabinete
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    //Metodo Criado para printar na tela que o botao de ligar foi pressionado
    public void pressPowerButton(){
        System.out.println("Power Button pressed");
    }
    //Getters para manipular no Main
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
