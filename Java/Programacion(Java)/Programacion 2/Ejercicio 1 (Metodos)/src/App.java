/*Desarrollar una aplicación java de consola, crear un array de 10 posiciones de números con valores
pedidos por teclado. Mostrar por consola el índice y el valor al que corresponde. Haz dos métodos,
uno para rellenar valores y otro para mostrar.*/
//Ejercicio 1
import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
        
    int [] numero = new int [10]; //Inicializo array de 10 posiciones 
    }

    public static void Rellenar(int lista[]) { //Metodo para rellanar los valores del array
    Scanner leer = new Scanner (System.in);    
    for ( int i = 0; i < lista.length; i++) {
    System.out.println("ingrese el relleno que tendra el array");
    lista[i]=leer.nextInt();
    }
    }
    public static void Mostrar(int lista[]) { //Metodo para mostrar valores
    for (int i=0;i<lista.length;i++){
    System.out.print(lista[i]);
    }
    }
}


   




        
    

