<header>
<h1 style="color:#DC0073">Spring- Configuración Basada en anotaciones</h1>
</header>
<hr>
<article>
<section>
<h3 style="color: #129490">¿Qué es la configuración basada en anotaciones? </h3>
<p>Habilitamos la configuración via XML, así podremos utlizar un set
de anotaciones en nuestras clases, metodos, constructores o archivos
en nuestra configuración de Beans.</p>
<h4 >Algunos ejemplos de anotaciones:</h4>
<ul>
<li>@Component</li>
<li>@Autowired</li>
<li>@Service</li>
</ul>
</section>
<section>
<h3>¿Qué es la etiqueta @Component?</h3>
<p>Es una anotación para cualquier clase de java que Spring maneje o trate
como un bean. En otras palabras, la anotación de clase con @Component, le estas
diciendo al framework de Spring  que una instancia de esa clase debe mantenerce
en el ApplicationContext.</p>
<h4>Ejemplo de @Component:</h4>
<code>
import org.springframework.stereotype.Component;
@Component
public class Bike implements Vehicle{
public void drive() {
System.out.println("Manejo moto");
}
}
</code>
<p>La clase Bike(moto) es marcada con la anotación @Component. Cuando el contener
de Spring empieza, este va a crear una instancia de la clase contenida en el 
ApplicationContext</p>

<a href="https://medium.com/@AlexanderObregon/understanding-and-implementing-the-component-annotation-in-spring-ca4734118cf8"> Fuente de información</a>
</section>
</article>
