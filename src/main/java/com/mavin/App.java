package com.mavin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*ApplicationContext es una interfaz central en el framework Spring que
        se utiliza para acceder a los beans, recursos y funcionalidades de la aplicación Spring. */

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car obj = (Car) context.getBean("car");
        obj.drive();

/*        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);*/
        //Imprime --> Esta funcionando


    }
}
