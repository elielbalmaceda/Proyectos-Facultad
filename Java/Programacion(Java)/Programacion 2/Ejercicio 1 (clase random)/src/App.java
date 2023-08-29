//Ejercicio 1
import java.util.Random; // nueva clase random
import java.util.Scanner;
public class App {    public static void main(String[] args) throws Exception {
  Random aleatorio = new Random();// creando una clase random
  int suma=0;
  int o = 1; 
  Scanner leer= new Scanner(System.in);
  System.out.println("Ingrese el tamaño del array:" );
  int[] array = new int[leer.nextInt()]; //asignando el valor del array por teclado
  for (int i : array){ //for mejorado
  i= aleatorio.nextInt(10);
  System.out.println("El número aleatorio entre 0 y 9 en la posición " + o + " del array es: " + i);
  o += 1;
  suma += i;
  }
  System.out.println("La suma total es de: " + suma);
        
}
  }

    

