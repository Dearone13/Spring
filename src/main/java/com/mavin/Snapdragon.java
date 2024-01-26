package com.mavin;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//Creamos bean con el tag y obtenemos los objetos por defecto
@Component
//@Primary //-->Toma ahora como prioridad esta clase
public class Snapdragon implements MobileProcessor{
    public void process(){
        System.out.println("Mejor CPU del mundo");
    }
}
