package com.mavin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Permite generar la inyección de dependencia desde la configuración base de anotación
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class); //-->Especifica que clase configura
        //Esta buscando por tipo segun la clase de configuración
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();

    }
}
