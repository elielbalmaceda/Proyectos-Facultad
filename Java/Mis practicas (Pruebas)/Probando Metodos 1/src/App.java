
public class App {
    public static void main(String[] args)throws Exception{
   /*  int resultado= suma(10,10);
    System.out.println(resultado);
    saludoPersonalizado("BEBE");
    }
    public static int suma(int a , int b){
        int resultado = a + b;  
        return resultado;
   } 
   public static void saludoPersonalizado(String nombre){
    System.out.println("hola " + nombre + " como estas?");

   }*/
   Ejemplos ejemplo = new Ejemplos(); //Cuando no es estático, debe
   //usarse un método
   //Llamando a un método sin argumentos, usando el objeto
   ejemplo.metodoEntero();
   //Asignando el valor retornado a una variable
   boolean respuesta = metodoBoolean(true, "hola");
   // El procedimiento no es static, así que debe llamarse desde el
   //objeto.
   ejemplo.procedimiento(0, "Juan");//Invocando el procedimiento
   //Usando una función como parámetro
   ejemplo.procedimiento(metodoBoolean(1, "hola"), "Juan");
   //Lo que retorne metodoBoolean (en este caso 1) se envía al
   //procedimiento
   }
   }







}
