package com.timbuchalka;

/**
 * Created by KH389659 on 27/09/2017.
 */
public class Dimensions {
    //Fields da classe Dimensions que possui uma variavel do seu tipo dentro de Gabinete.
    private int width;
    private int height;
    private int depth;
    //Construtor da classe Dimensions
    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    //Getters para Manipular no Main
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
