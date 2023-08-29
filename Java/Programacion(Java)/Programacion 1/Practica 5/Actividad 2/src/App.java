//ejercicio 2 del parcial
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leer= new Scanner(System.in);
     int num1;
     int num2;
     do{
        System.out.println("ingrese un numero");
        num1=leer.nextInt();
        System.out.println("ingrese otro numero");
        num2=leer.nextInt();
        if(num1 == num2){
            System.out.println(num1 + " y " + num2 + " Son iguales");
        }else{ 
        System.out.println("volver a ingresar los numeros");
     }
     }while (num1 != num2);
    }   
}