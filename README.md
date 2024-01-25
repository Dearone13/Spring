<header>
<h1 style="color:#DC0073">Spring-Anotación @Autowired</h1>
</header>
<article>
<section>
<h3 style="color: #129490">¿Qué es el tag Autowired en Spring? </h3>
<p>Nos permite crear instancias especificas de un atributo de una clase, es decir nos permite
generar inyecciones automaticas de cualquier tipo sin una 
configuración tediosa del archivo xml.</p>
<h4>Funciones.</h4>
<ul>
<li>Permite inyectar beans en otra beans, setter methods, constructores y properties basado en tipo.</li>
<li>Si solo existe un bean de determinado tipo, Spring lo inyectará automáticamente.</li>
<li>Resuelve e inyecta colaboraciones beans sin necesidad de configuración explícita.</li>
</ul>
<h4>Como lo programo:</h4>
<ul><li><a href="https://github.com/Dearone13/Spring/blob/autowired/src/main/java/com/mavin/Car.java">Clase car con atributo tyre y etiqueta</a></li></ul>
<ul><li><a href="https://github.com/Dearone13/Spring/blob/autowired/src/main/java/com/mavin/App.java">Clase main</a></li></ul>
<ul><li><a href="https://github.com/Dearone13/Spring/blob/autowired/src/main/resources/ApplicationContext.xml">Archivo XML</a></li></ul>
</section>
</article>
