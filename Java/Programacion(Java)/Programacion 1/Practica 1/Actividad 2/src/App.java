import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String usuario, contraseña;
        Scanner leer=new Scanner(System.in);
        System.out.println("Registra tu usuario:"); 
        usuario=leer.nextLine();
        System.out.println("Registrar tu contraseña:"); 
        contraseña=leer.nextLine();
        System.out.println("Usuario registrado");

        System.out.println("ingresa tu usuario:");
        String user=leer.nextLine();
        System.out.println("ingresa tu contraseña:");
        String contra=leer.nextLine();

if (user!= usuario){
System.out.println("usuario incorrecto");
if (contra!= contraseña){
    System.out.println("contraseña incorrecto");
}  else{
        System.out.println("usuario correcto");
        } 
    }else
System.out.println("contraseña correcta");
        }
    }
