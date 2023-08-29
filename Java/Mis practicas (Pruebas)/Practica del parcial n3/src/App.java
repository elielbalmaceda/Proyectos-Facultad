import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {  
    Scanner entrada=new Scanner(System.in);
    int[] num= new int[5];
    int suma=0;
    for (int i = 0; i < num.length; i++) {
        System.out.print("Ingresar un número: ");
        num[i] = entrada.nextInt();
        suma += num[i];
    }
    System.out.println("La suma de los números ingresados es " + suma);
    }
}
