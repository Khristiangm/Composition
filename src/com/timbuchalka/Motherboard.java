package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Motherboard {
    //Fields da Placa mae
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;
    //Construtor da Placa Mae
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    //Metodo criado para simular a inicialização de um programa
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now Loading...");
    }
    //Getters para Serem chamados no MAIN.
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
