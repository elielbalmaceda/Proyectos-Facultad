import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     Scanner descuento= new Scanner (System.in);
     System.out.println("ingresar monto de la compra");
     int monto = descuento.nextInt();
     System.out.println("ingresar forma de pago");
     Scanner pagar= new Scanner(System.in);
     String pago=pagar.nextLine();
    
     int porcentaje =monto * 10/100;
    if (pago.equals("contado")){
        System.out.println("se aplica descuento del 10");

    }

    }
}
