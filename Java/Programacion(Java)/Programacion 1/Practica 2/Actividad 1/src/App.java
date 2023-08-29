import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int A, B;
Scanner pirulo=new Scanner(System.in);
System.out.println("ingresa un numero para A");
A=pirulo.nextInt();
System.out.println("ingresa un numero para B");
B=pirulo.nextInt();
    System.out.println("A vale " + (A=B));
    System.out.println("asignale de nuevo valor A");
    A=pirulo.nextInt();

    System.out.println("B vale " + (B=A));
    
    }
}
