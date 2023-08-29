//Ejercicio 1
import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leer = new Scanner (System.in);
    String[] array1 = new String[2];
    String[] array2 = new String[2];
System.out.println("Ingresa valor de el primer array");
for (int i=0; i < array1.length; i++ ){
    array1[i]= leer.nextLine();
    }
    System.out.println("Ingresa valor de el segundo array");
for (int j=0; j < array2.length; j++ ){
    array2[j]= leer.nextLine();
    }
if (Arrays.equals(array1, array2)){
System.out.println("Son iguales ");
}
else{ 
    System.out.println("no son iguales");
}      
    }
}
