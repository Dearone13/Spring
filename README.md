<header>
<h1 style="color:#DC0073">Spring- Propiedades de los Bean</h1>
</header>
<hr>
<article>
<section>
<h3 style="color: #129490">¿Qué es el tag property en Spring? </h3>
<p>En el contexto del framework Spring se utiliza para inyectar
valores a las propiedades de los beans.</p>
</section>
<section>
<h3>Funcion de la etiqueta property</h3>
<ul>
<li>Inyectar valores y propiedades al bean</li>
<li>Se define el atributo con la propiedad (name)</li>
<li>El valor inyectar se define con el atributo (value)</li>
</ul>
<h3>Definimos la clase tyre</h3>

<pre>
package com.mavin;

public class Tyre {
    private String brand; //brand --> marca

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
</pre>
<h3>Como definimos el archivo XML</h3>
</section>
</article>
