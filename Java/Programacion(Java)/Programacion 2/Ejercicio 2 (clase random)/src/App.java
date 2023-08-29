//ejercicio 2
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leerN = new Scanner(System.in);
    System.out.println("Ingresa valores que contendra el array: ");
        int [] myarray = new int[leerN.nextInt()];
       int nummayor=0;
        for (int i : myarray) {
            System.out.println("Ingresar el número del array");
            i = leerN.nextInt();
            if (i > nummayor) {
                nummayor = i;   
        }
    }
    System.out.println("El número mayor del array es: " + nummayor);
}
}