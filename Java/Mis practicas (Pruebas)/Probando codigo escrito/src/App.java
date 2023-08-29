import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner teclado=new Scanner(System.in);
    int num1,num2,mult;
    System.out.println("ingresa primer numero");
    num1=teclado.nextInt();
    System.out.println("ingresa segundo numero");
    num2=teclado.nextInt();
    mult=num1*num2;
    System.out.println("resultado es:" + mult); 

    }
}
