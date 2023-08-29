import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   System.out.println("ingresar valor de temperatura:1");
        Scanner leer = new Scanner(System.in);
        double gradosC =leer.nextInt();
        double gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC + " grados Centígrados equivalen a " + gradosF + " grados Fahrenheit");
    }
}
