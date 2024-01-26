package com.mavin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Creamos Bean por medio de la anotación @Component
//Podemos poner id por defecto a nuestro bean --> @Component("mySamsung")
@Component
//Por defecto saldra el nombre de la clase sin mayusculas
public class Samsung {
    //Conectamos la inyección de dependencia con el atributo especifico que necesitamos
    @Autowired
    @Qualifier("mediatek") //--< Identica que @componet neceistamos instanciar
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public  void config(){
        System.out.println("Octa Core, 4 gb Ram, 12MP camera");
        cpu.process();
    }
}
