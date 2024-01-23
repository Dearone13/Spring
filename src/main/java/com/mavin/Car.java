package com.mavin;

import org.springframework.stereotype.Component;

// Lo definimos como un componente bean sin necesidad de mencionarlo en nuestro arhcivo de xml
@Component
public class Car implements Vehicle{
    public void drive() {
        System.out.println("Manejo Carro");
    }
}
