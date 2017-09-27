package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //    Resolution resolution = new Resolution(1980,1080); Forma de Baixo e mais pratica de se fazer..
        Dimensions dimensions = new Dimensions(15, 23, 3);
        Case theCase = new Case("1151px", "Asus", "Corsair 600w", dimensions);
        Monitor theMonitor = new Monitor("G2460F", "AOC", 23, new Resolution(1980, 1080));
        Motherboard theMotherBoard = new Motherboard("gx1151", "Asus", 2, 5, "Bios");
        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
        thePC.getMonitor().drawPixelAt(2040,1080,"Blue");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();

//        System.out.println(theMotherBoard.getModel());
//        System.out.println(theMonitor.getNativeResolution());
//        System.out.println(theMonitor);
    }


}
