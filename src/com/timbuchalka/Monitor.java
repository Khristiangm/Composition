package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Monitor {
    //Fields de Monitor
    private String model;
    private String manufacturer;
    private int size;
    //field composto do tipo Resolution que possui outros atributos setados em sua classe
    private Resolution nativeResolution;
    //Construtor de Monitor
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    //Metodo criado para exibir os eixos x e y mais a cor do monitor
    public void drawPixelAt(int x, int y, String color){

        System.out.println("Drawing pixel at " + x +"," + y + " in color " + color);
    }
    //Getters para manipular no Main.
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
    public String toString(){
        return "" + this.model +" and " + this.manufacturer;
    }
}

