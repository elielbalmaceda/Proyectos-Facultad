import java.util.Scanner;
public class App {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int N;
            System.out.println("Introduce un Número: ");
            N = reader.nextInt();
            if (N == 1)
                System.out.println("Hoy es Lunes");
            else if (N == 2)
                System.out.println("Hoy es Martes");
            else if (N == 3)
                System.out.println("Hoy es Miércoles");
            else if (N == 4)
                System.out.println("Hoy es Jueves");
            else if (N == 5)
                System.out.println("Hoy es Viernes");
            else if (N == 6)
                System.out.println("Hoy es Sábado");
            else if (N == 7)
                System.out.println("Hoy es Domingo");
            else
                System.out.println("Número no válido");
        }
    }


