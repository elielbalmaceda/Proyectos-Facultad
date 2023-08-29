public class App {
    //practica7 actividad3
    public static void main(String[] args) throws Exception {
    int suma=0, producto=0;
    int contador=20;
    do{ producto=producto*contador;
        suma=suma+contador;
        contador=contador+2;
      }while (producto<100);
      System.out.println("El resultado del producto es"+ producto);
      System.out.println("El resultado del suma es"+ suma);
    
    
    }
}
