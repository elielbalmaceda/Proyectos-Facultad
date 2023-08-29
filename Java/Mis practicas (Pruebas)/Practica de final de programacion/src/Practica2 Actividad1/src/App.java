import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      int a;
      int b;
        Scanner numero= new Scanner(System.in);
        System.out.println("Ingresar un valor para a");
        a= numero.nextInt();
        System.out.println("Ingresar un valor para b");
        b= numero.nextInt();
        System.out.println("b vale:"+ (a = b));
        System.out.println("Vuelve a asignarle un valor a A");
        a = numero.nextInt();
        System.out.println("a vale: " + (b = a));
}
}