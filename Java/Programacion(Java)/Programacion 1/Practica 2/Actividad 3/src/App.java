import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner pirulo =  new Scanner(System.in);
    int num1,num2;
    System.out.println("Ingrese numero 1");
    num1=pirulo.nextInt();
    System.out.println("Ingrese numero 2");
    num2=pirulo.nextInt();
    if (num1>num2){
        System.out.println(num1 + " es mayor a " + num2);
    }if (num1<num2){
        System.out.println(num1 + " es menor a " + num2);
    }if (num1==num2){
        System.out.println(num1 + " es igual a " + num2);
    }
    }
}
