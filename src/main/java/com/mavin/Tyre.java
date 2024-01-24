package com.mavin;

public class Tyre {
    private String brand; //brand --> marca


    //Se reliza un inyección por mediod e los setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //Esto lo que imprime la instancia cuando se invoca al bean
    @Override
    public String toString() {
        return "Esta funcionando";
    }
}
