import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner pirulo= new Scanner(System.in);
       int num1,num2,num3; 
       System.out.println("ingresa numero 1");
        num1=pirulo.nextInt();
        System.out.println("ingresa numero 2");
        num2=pirulo.nextInt();
        System.out.println("ingresa numero 3");
        num3=pirulo.nextInt();
if (num1>num2 && num1>num3){
    System.out.println(num1 + " es mayor a " + num2 + " y a " + num3);
}if (num2>num1 && num2>num3){
    System.out.println(num2 + " es mayor a " + num1 + " y a " + num3);
}if (num3>num2 && num3>num1){
    System.out.println(num3 + " es mayor a " + num2 + " y a " + num1);
}
    }
}
