import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario por un número de dos cifras
        System.out.print("Por favor, ingrese un número de dos cifras del 0 al 99: ");
        int userNumber = scanner.nextInt();

        // Validar que el número tenga dos cifras
        if (userNumber < 10 || userNumber > 99) {
            System.out.println("El número ingresado no es válido. Debe ser de dos cifras.");
            return;
        }

        // Calcula la suma de las cifras del número
        int tens = userNumber / 10;
        int ones = userNumber % 10;
        int difference = userNumber - (tens + ones);

        // Muestra el número ingresado por el usuario y el resultado
        System.out.println("Usted ingresó el número: " + userNumber);
        System.out.println("Resultado: " + userNumber + " - " + (tens + ones) + " = " + difference);

        // Muestra los números del 0 al 75
        System.out.println("Números del 0 al 75:");
        for (int i = 0; i <= 75; i++) {
            System.out.print(i + " ");
        }

        // Cierra el scanner
        scanner.close();
    }
}

