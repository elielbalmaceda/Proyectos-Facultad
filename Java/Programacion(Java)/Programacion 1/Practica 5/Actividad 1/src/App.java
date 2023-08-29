import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado =new Scanner(System.in);
        int num1,num2=1;
        do{
            System.out.println("ingresar primer numero");
            num1=teclado.nextInt();
            System.out.println("ingresar segundo numero");
            num2=teclado.nextInt();
        }while (num1 != num2);
            System.out.println("son numeros iguales");  
    }
    }
