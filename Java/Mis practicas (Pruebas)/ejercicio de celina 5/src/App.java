import java.util.Scanner;// Declaro la clase Scannner
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leer = new Scanner(System.in);// nombre del Scanner
    int num1, num2;// Declare dos variables para luego leerlos
    do{ //Uso la estructura Do-While que hace un proceso repetitivo 
    System.out.println("Por favor, Ingresa el primer numero: ");//Le pido al usuario que ingrese un numero
    num1= leer.nextInt(); //Guardo con el Scanner la variable num1 lo que ingreso el usuario
    System.out.println("Ingresa un segundo numero: ");
    num2= leer.nextInt();//Guardo lo que ingreso el usuario en la segunda variable
   } while (num1 != num2); //Si el numero 1 es igual a numero 2 el bucle sigue 
    if (num1 == num2);//Si numero 1 es igual a numero 2 el bucle termina por eso uso un if
    System.out.println("¡Correcto!");
}
}