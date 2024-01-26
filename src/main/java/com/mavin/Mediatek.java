package com.mavin;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //-->Tomara como primera opción para escanear la clase
public class Mediatek implements MobileProcessor{

    public void process() {
        System.out.println("Segundo mejor");
    }
}
