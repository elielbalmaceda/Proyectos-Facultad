import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer=new Scanner(System.in);
       String eliel, balmaceda; 
       do{
        System.out.println("ingresar usuario");
        eliel=leer.nextLine();
        System.out.println("ingresa contraseña");
        balmaceda= leer.nextLine();
        if ((eliel.equals("eliel"))&!balmaceda.equals("Balmaceda")) {
          System.out.println("perfil correcto");
        }
 
       }while(!(eliel.equals("eliel"))&&!balmaceda.equals("Balmaceda"));
    }
}
