package com.mavin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Esta clase se encargara de la configuración del mismo modo como se encargaba el archivo XML
//Clase responsable de dar objetos
@Configuration

public class AppConfig {

    //Se debe espicificar que retorne la instancia como bean
    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }
    @Bean
    public MobileProcessor getCpu(){
        return new Snapdragon();
    }
}
