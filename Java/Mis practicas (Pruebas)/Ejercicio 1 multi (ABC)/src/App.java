import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner (System.in);
    
            char[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
            String cadena = "";
            int posicion;
            
            System.out.println("Ingrese posiciones para crear una cadena de texto, cuando ya no quiera poner una   posición ingrese -1 para finalizar");
            
            int i = 1;
            do {
                System.out.println("posición " + i + ")");
                posicion = leer.nextInt();
                i += 1;

                if (posicion <= 27 && posicion >= 1) {
                    cadena += caracteres[posicion - 1];
                }
                else if (posicion >= 27 || posicion <= 1){
                    System.out.println("El número ingresado es incorrecto, vuelva a ingresar uno");
                    i -= 1;
                }
            }
            while (posicion != -1);
            System.out.println("Fin \nCadena resultante: " + cadena);
        }
}


















