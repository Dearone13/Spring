<header>
<h1 style="color:#DC0073">Spring-Anotación component, sin uso de @Bean</h1>
</header>
<article>
<section>
<h3 style="color: #129490">¿Como configuramos sin el uso de la anotación @Bean? </h3>
<p>Utilizamos las anotaciones @Component que nos permite crear Bean a partir de las clases que seleccionamos
para invocar la inyección de dependencia, además de generar las instancias necesarias.Por otra parte, podemos utilizar 
anotaciones como <a href="https://github.com/Dearone13/Spring-Core/blob/SpringcoreAnno/src/main/java/com/mavin/Mediatek.java">@Primary</a> que definiran la prioridad para instanciar una clase sobre otra marcada con los @Component.
</p>
<p>En nuestra clase <a href="https://github.com/Dearone13/Spring-Core/blob/SpringcoreAnno/src/main/java/com/mavin/AppConfig.java">AppConfig</a> utilizamos la anotación @ComponentScan que nos permite hacer la configuración en automatico escaneando 
las anotaciones dentro del paquete seleccionado.</p>
<h4>Otras anotaciones para instanciar segun prioridad.</h4>
<p>Utilizamos anotaciones como <a href="https://github.com/Dearone13/Spring-Core/blob/SpringcoreAnno/src/main/java/com/mavin/Samsung.java">@Qualifer() </a>para determinar que clase queremos instanciar.</p>

</section>
</article>
