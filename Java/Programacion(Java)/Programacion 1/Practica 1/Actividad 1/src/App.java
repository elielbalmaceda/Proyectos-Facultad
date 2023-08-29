import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    int num1, num2, suma=0;
    Scanner eliel=new Scanner(System.in);
    System.out.println("Ingresa un numero");
    num1=eliel.nextInt();
    System.out.println("Ingresa otro numero");
    num2=eliel.nextInt();
    suma= num1+num2;
    System.out.println("la suma es:"+ suma );
}
}
