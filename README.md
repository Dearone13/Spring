<header>
<h1>Spring- Tutorial</h1>
<p>Aca reciden información relacionada al Framework de java, Spring.</p>
<a href="https://www.youtube.com/watch?v=If1Lw4pLLEo&t=2813s&ab_channel=Telusko">Video tutorial: Telusko</a>
</header>
<section>
<h3>Orden de las ramas por temas</h3>
<ul>
<li><a href="https://github.com/Dearone13/Spring">Introducción a Spring-main</a></li>
<li><a href="https://github.com/Dearone13/Spring/tree/AnnotationsBased">Configuración de anotaciones-AnnotationsBased </a></li>
<li><a href="https://github.com/Dearone13/Spring/tree/beanproperty">Propiedades de los beans-beanproperty</a></li>
<li><a href="https://github.com/Dearone13/Spring/tree/consinject">Inyección de constructores-consinject</a></li>
<li><a href="https://github.com/Dearone13/Spring/tree/autowired">Anotación @Autowired-autowired</a></li>
<li><a href="https://github.com/Dearone13/Spring/tree/confiBean">Configuración de beans para anotaciones-confiBean</a></li>
<li><a href="https://github.com/Dearone13/Spring-Core/tree/SpringcoreAnno">Inyección de dependencia sin necesidad de @Bean.</a></li>
</ul>
</section>
<section>
<article>
<h3>¿Qué es Spring framework?</h3>
<p>Spring framework nos provee una programación integral y un modelo de configuración moderno para aplicaciones empresariales 
basado en Java o cualquier plataforma de desarollo.</p>

<p>El principal elemento de Spring es su infraestructura de soporte al nivel de las aplicaciones, este se centra en la construcción
de las aplicaciones empresariales para que los equipos de desarollo puedan concentrarse en el nivel logico de la aplicación empresarial sin vinculos
innecesarios a ambientes especificos de desarollo. </p>
<h3>Modulos.</h3>
<p>El framework de Spring consiste alrededor de caracteristicas alrededor de 20 modulos. </p>
<h4>Esto están agrupados en Core Container,Data Access/Integration, Web, AOP (Aspect Oriented Programming), Instrumentation, and Test.</h4>
<ul>

<li>Core Container: Consiste en el Core,Beans, Context, y expresión del lenguaje de modulos.</li>
<ul> 
<li>Core and Beans: proveen las partes fundamentales del framework, incluida IoC(Inversión de control) y inyección de dependencias.</li>
<li>Context: El módulo está construido en una sólida base de los modulos de Core y Beans. Es un medio que facilita el acceso a los objetos, la internalización de paquetes, carga de recursos y transparencia de contextos.</li>
<ul>
<li>La  interface "ApplicationContext" es el foco centras de módulo Context.</li>
</ul>
<li></li>
</ul>
<li>Data Access/Integration:</li>
<li>Web:</li>
<li> AOP (Aspect Oriented Programming):</li>

</ul>
<a><img src="https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/images/spring-overview.png"></a>

</article>
</section>
<section>
<h3>Como programar el Maven en intelli</h3>
<p>Para realizar nuestro proyecto utilizamos un espacio maven que nos 
permita inyectar las dependencia del proyecto.</p>
<h4>¿Qué es Maven?</h4>
<p>Es una herramienta de construcción licencia bajo apache con una gran contención de librerias, su funcionamiento es POM.XML
en este espacio mencionamos las dependencias.</p>
<h5>Orden de un proyecto maven</h5>
<pre>1. Project
2. Groupld - com.CourseS //--->Nombre del paquete
3. Artifactld - demo  //--->Representa el nombre del proyecto
4. Package - com.CourseS.demso.web
</pre>
<h5>Configuración del proyecto Maven</h5>
<a href="https://i.imgur.com/1aJwChH.png"><img src="https://i.imgur.com/1aJwChH.png"></a>
<h4>Dependencia spring del pom.xml</h4>
<p>Podemos aceder a todas dependencia con Maven respository.</p>
<a href="https://mvnrepository.com/artifact/org.springframework/spring-context/5.2.21.RELEASE">Maven repository spring 5.2.21 página</a>
<pre >


      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.2.21.RELEASE</version>
    </dependency>


</pre>


</section>
