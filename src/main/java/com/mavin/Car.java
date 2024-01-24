package com.mavin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Lo definimos como un componente bean sin necesidad de mencionarlo en nuestro arhcivo de xml
@Component
public class Car implements Vehicle{
    //Designo que se se me cree una instancia del objeto tyre y una inyección
    @Autowired
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive() {

        System.out.println("Car :"+tyre);
    }
}
