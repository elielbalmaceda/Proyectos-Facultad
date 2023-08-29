import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner eliel= new Scanner(System.in);
    int num1, num2, x=1, resultado;
    System.out.println("ingresar un numero");
    num1=eliel.nextInt();
     System.out.println("ingresar segundo numero");
    num2=eliel.nextInt();
    while (x<=num2){
    resultado= num1*x;
    System.out.println(num1 + " * " + x + " = " + resultado );
    x++;
    }
}
}