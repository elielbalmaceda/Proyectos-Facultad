//Ejercicio 2
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leer = new Scanner(System.in);
    Random numeroRandom = new Random();

    System.out.println("Ingresar el tamaño de las columnas");
    int[][] myArray = new int[5][leer.nextInt()];

    for (int i = 0; i < myArray.length; i++) {
        for (int j = 0; j < myArray[i].length; j++) {
            myArray[i][j] = numeroRandom.nextInt(11);
            System.out.println(myArray[i][j]);
    }
}
}
}
    
