import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leer= new Scanner(System.in);
    System.out.println("ingresa un numero ");
    double num1 =leer.nextDouble();
    System.out.println("ingresa un segundo numero");
    double num2=leer.nextDouble();
    if (num1 == num2){
        System.out.println("son iguales");
    }else if (num1 > num2){
        System.out.println("el numero mayor es:"+ num1);
    }else {
        System.out.println("el numero menor es:"+ num2);
    }
    }
}
 