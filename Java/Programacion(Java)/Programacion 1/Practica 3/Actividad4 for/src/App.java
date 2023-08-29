import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner pirulo= new Scanner(System.in);
    double e=4;
    int suma=0;
    int num=0;
    System.out.println("ingresar numero");
    for (int i = 1; i <= e; i++) {
    System.out.println("Ingrese el " + i + " número"); 
    num = pirulo.nextInt();
    suma = suma + num; 
    }
    System.out.println("el promedio de la suma es "+ suma/ e);   

}
}