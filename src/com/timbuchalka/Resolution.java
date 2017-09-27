package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Resolution {
    //Fields da classe Resolution que possui uma variavel de seu tipo na classe Monitor
    private int width;
    private int height;
    //Construtor da classe Resolution
    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }
    //Getters para manipular no main
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    //Metodo Criado herdando uma classe toString da classe OBJECT do java, tornando possivel printar 2 atributos com apenas 1 GET
    @Override
    public String toString(){
        return "" + this.width + "x" + this.height;
    }
}
