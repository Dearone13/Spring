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
/*        Vehicle obj = (Vehicle) context.getBean("bike");
        obj.drive();*/
        //Inyección generada desde el constructor
        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);
        // Sin una definicion de property
        //imprime --> Tyre{brand='null'}
        //Con una definición de property
        //imprime --> Tyre{brand='MRF'}


    }
}
