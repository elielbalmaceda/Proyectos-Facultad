/**
 * Esta clase 'UserController' pertenece al paquete 'controllers'.
 * En principio, solo debería atender a los requests HTTP,
 * y según sea GET, POST, u otro método, analizar el contenido
 * del request, y decidir a qué método llamar. 
 * En principio, esta clase no debería hacer el trabajo. No.
 * Lo que debería hacer es llamar al método encargado de hacer
 * el trabajo y pasarle los parámetros necesarios. 
 * Ese otro método llamado debería pertenecer a una clase del paquete 'services'. 
 * Pero nosotros no tenemos ese paquete, porque este es un ejemplo muy simple.
 * Veremos que esta clase 'UserController' hace todo el trabajo, lo que no debería ser así.
 * Entonces, tenemos que recordar que estamos dejando de lado un principio
 * muy importante, para no complicar este ejemplo.
 */
package tup.simple.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tup.simple.models.User;
import tup.simple.repositories.UserRepository;

/**
 * La anotación @RestController es la combinación de @Controller
 * y @ResponseBody.
 * Está anotando la clase, o sea que todos los métodos la heredan y
 * no es necesario anotar cada uno de ellos. Todos tendrán la semántica
 * de @ResponseBody. Esto significa que la String retornada es la response, no
 * el nombre de una vista.
 */
@RestController
// La URL que va entre paréntesis en esta anotación habrá que agregarla detrás
// del puerto 8080 en todas las llamadas a esta aplicación.
// Por ejemplo @RequestMapping("/user") resultaría en lo siguiente:
// localhost:8080/user.... y detrás de esto habría que agregar el
// resto de la URL.
// En este caso, no necesitamos nada, y queda simplemente localhost:8080
@RequestMapping("")
public class UserController {
  /**
   * Qué es un bean en Java
   * https://stackoverflow.com/a/3295517/2740402
   * Un JavaBean es solo un estándar. Es una clase regular de Java, excepto que
   * sigue ciertas convenciones:
   * - Todas las propiedades son privadas (usan getters y setters).
   * - Tiene un constructor público sin argumentos.
   * - Implementa la interfaz Serializable.
   * Eso es todo. Es solo una convención.
   * 
   * La anotación '@Autowired' significa que Spring va a inyectar en esta clase un
   * bean llamado 'userRepository' de tipo 'UserRepository'.
   * No hay en este proyecto una clase 'UserRepository'. Solo hay una
   * interfaz 'UserRepository'. Y esta interfaz lo único que hace es extender
   * 'CrudRepository'. No declara ni campos ni métodos. Nosotros no hacemos nada,
   * todo lo hace Spring por nosotros.
   * Esta es la inyección de dependencia. Nosotros lo único que hacemos es
   * declarar la variable 'userRepository' de tipo 'UserRepository', y ponerle
   * la anotación '@Autowired'. Y listo. Ya tenemos en esta clase 'UserController'
   * la variable 'userRepository' correctamente configurada e inicializada, de
   * manera que la podemos usar sin más.
   * Notar que tampoco hemos programado los métodos que estamos llamando,
   * y que están declarados en la interfaz 'CrudRepository'.
   * Los nombres de los métodos que nosotros creamos en esta clase
   * son arbitrarios. Pero los nombres de los métodos que invocamos
   * sobre el objeto 'userRepository' tienen que ser los de la interfaz.
   */
  @Autowired
  private UserRepository userRepository;

  @PostMapping("/add") // Map ONLY POST Requests
  // @RequestParam means it is a parameter from the GET or POST request
  public String añadirProvincia(@RequestParam String temperatura,@RequestParam String humedad, @RequestParam String provincia,  @RequestParam String actividad, @RequestParam String precipitaciones) {

    User user = new User();
    user.setTemperatura(temperatura);
    user.setHumedad(humedad);
    user.setProvincia(provincia);
    user.setActividad(actividad);
    user.setPrecipitaciones(actividad);
    userRepository.save(user);
    return "Se grabó el nuevo user.";
  }

  @PostMapping("/delete/{id}") // Map ONLY POST Requests
  /**
   * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PathVariable.html
   * 
   * @PathVariable significa que el parámetro 'id' está ligado a una variable de
   *               template del URI
   */
  public String deleteUserById(@PathVariable Long id) {
    userRepository.deleteById(id);
    return "Deleted";
  }

  @GetMapping("/{id}")
  public String findUserById(@PathVariable Long id) {
    // @PathVariable indica que el parámetro 'id', de tipo Long, es una
    // variable de template que viene en la URI.
    /**
     * https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html#findById-ID-
     * Optional<T> findById(ID id)
     */
    String resp = primeraParte();
    /**
     * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Optional.html
     * El método findById() tiene un tipo de retorno Optional.
     * Dicho brevemente, significa que el objeto retornado puede estar
     * presente, o no estar presente. O está, o no está. Solo hay dos opciones.
     * Si está, lo puedo extraer con el método get(). En este caso, el get()
     * me devuelve simplemente el objeto de tipo User, con sus campos
     * debidamente completados con los valores que JPA sacó de la tabla
     * correspondiente de la base de datos.
     */
    if (userRepository.findById(id).isPresent()) {
      /**
       * No necesito el operador new. Solo lo uso cuando quiero crear una
       * instancia que todavía no existe, por eso es 'nueva'. En este caso,
       * el objeto user ya existe, y me viene retornado por el método get().
       * No necesito crearlo, solo se lo asigno a la variable.
       */
      User user = userRepository.findById(id).get();

      resp += "<tr>"
          + "<td>" + user.getId() + "</td>"
          + "<td>" + user.getTemperatura() + "°</td>"
          + "<td>" + user.getHumedad() +  "%</td>"
          + "<td>" + user.getProvincia() + "</td>"
          + "<td>" + user.getActividad() + "</td>"
          + "<td>" + user.getPrecipitaciones() + "%</td>"
          + "</tr>";
    } else {
      resp += "<tr>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "<td>" + "-" + "</td>"
          + "</tr>";

    }
    return resp + "</table>";
  }

  @GetMapping("/all")
  public String getAllUsers() {
    // This returns a JSON or XML with the users
    Iterable<User> iterable = userRepository.findAll();
    String resp = primeraParte();
    /**
     * Ya terminé con la fila de los encabezados, y ahora tengo que
     * generar el cuerpo de la tabla, una fila por cada registro.
     * No puedo usar forEach() con una función lambda
     * porque el scope de las variables no lo permite.
     * Por eso uso el for mejorado, para recorrer el objeto iterable.
     */
    for (User user : iterable) {
      resp += "<tr>"
          + "<td>" + user.getId() + "</td>"
          + "<td>" + user.getTemperatura() + "°</td>"
          + "<td>" + user.getHumedad()  +"%</td>"
          + "<td>" + user.getProvincia() + "</td>"
          + "<td>" + user.getActividad() + "</td>"
          + "<td>" + user.getPrecipitaciones() + "%</td>"
          + "</tr>";
    }
    return resp + "</table>";
  }

  @GetMapping("")
  public String hola() {
    return "¡Hola, bienvenido a Space Equis!";
  }
  private String primeraParte() {
    /**
     * Lo que viene a continuación se llama text block,
     * y es tipo String. El Manual de Java los describe en
     * la sección 3.10.6 Text Blocks.
     * 
     * Ese bloque de texto es todo que lo que está contenido entre los dos
     * delimitadores: el de apertura y el de cierre.
     * El delimitador de apertura es la triple comilla ' """ ' que está a la
     * derecha de la sentencia return.
     * El delimitador de cierre es la triple comilla ' """ ' que está al final.
     * Todo es seguido por el punto y coma, porque es el final de una sentencia.
     * 
     * No es buen estilo incluir cadenas largas en un archivo de código fuente.
     * Esto lo hago solo para no introducir una complicación que no agregaría
     * nada a los conceptos que estoy discutiendo ahora.
     * 
     * Comenzamos por poner unos estilos CSS, para que la tabla quede más linda.
     * 
     * Cuando terminamos con los estilos, arrancamos con el HTML de la
     * tabla misma. Lo primero que hacemos es generar una fila y en las
     * celdas de esa fila poner los encabezados, que son los nombres de
     * las columnas o campos de la tabla que está en la base de datos.
     * 
     * Dentro del estilo, el selector #users indica que el estilo
     * que estamos definiendo es para ser usado solamente en el
     * elemento del DOM que tiene id='users', o sea la tabla.
     */
    return """
  
  <style>
  body{
    background-image:url('https://lh5.ggpht.com/-jkwbXq4_K9I/UY4n7oqYiMI/AAAAAAAAs6I/Ywh-K1bHEf4/s1600/20130511_163936.jpg');
    }
    .text
            #users {
              font-family: Sans-Serif;
              border-collapse: separated;
              width: 90%;
            }
            #users td, #users th {
              border: 6px solid #ddd;
              padding: 35px;
            }
            #users tr:nth-child(odd){background-color: #0d69fc;}
            #users tr:nth-child(even){background-color: #0d69fc;}
            #users tr:hover {background-color: #d7e6f7;}
            #users th {
              padding-top: 20px;
              padding-bottom: 20px;
              text-align: left;
              background-color: #6C6868;
              color: white;
            }
          </style>
          <center>
          <body>
          <div>
          <body>
            <h1 style="color: white;">¡Bienvenido a Space Equis!</h1>
          </div>
          <h2 style="color: white;" > Miercoles </h2>
          
          <table id='users'>
            <tr>
              <th>Id</th>
              <th>Temperatura</th>
              <th>Humedad</th>
              <th>Provincia</th>
              <th>Actividad</th>
              <th>Precipitaciones</th>
            </tr>
            </body>
          <center>
        """;
  }
}
