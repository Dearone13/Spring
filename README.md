<header>
<h1 style="color:#DC0073">Spring- Propiedades de los Bean(Inyección de setter y constructor)</h1>
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
<a href="https://github.com/Dearone13/Spring/blob/beanproperty/src/main/java/com/mavin/Tyre.java">Definimos la clase tyre</a>
<h3>Como definimos el archivo XML</h3>
<a href="https://github.com/Dearone13/Spring/blob/beanproperty/src/main/resources/ApplicationContext.xml">Definición del archivo xml link</a>
<h3>Petición desde la clase main</h3>
<a href="https://github.com/Dearone13/Spring/blob/beanproperty/src/main/java/com/mavin/App.java">Clase main</a>
<p>Las inyecciones anteriores fueron inyecciones de setter.</p>
</section>
<section>
<h2>Inyecciónes de caracter constructor</h2>
<p>Las inyecciones se pueden realizar desde el constructor para ello modificaremos la estructura de nuestro bean
del archivo XML, además de generar un constructor en la clase.</p>

<ul>
<li><a href="https://github.com/Dearone13/Spring/blob/consinject/src/main/resources/ApplicationContext.xml">Configuración del archivo XML.</a></li>
<li><a href="https://github.com/Dearone13/Spring/blob/consinject/src/main/java/com/mavin/Tyre.java">Clase tyre(Constructor).</a></li>
<li><a href="https://github.com/Dearone13/Spring/blob/consinject/src/main/java/com/mavin/App.java">Clase main.</a></li>
</ul>
</section>
</article>
