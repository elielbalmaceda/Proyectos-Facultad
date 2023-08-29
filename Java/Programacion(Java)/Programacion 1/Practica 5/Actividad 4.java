import java.util.Scanner;
//Realizar un programa en Java que lea un número por teclado y muestre a qué día de la
//semana corresponde. Si el número leído es 1 visualizará “Lunes”, si es 2 visualizará
//“Martes”, si es 3 visualizará “Miércoles”, y así sucesivamente … Para cualquier otro
//valor visualizará “No válido”.
public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scan= new Scanner(System.in);
        int A;
        System.out.println("Introduce un numero segun los dias de semana:");
        A= scan.nextInt();
        switch(A) {
            case 1: System.out.println("Lunes");
            break;
            case 2: System.out.println("Martes");
            break;
            case 3: System.out.println("Miercoles");
            break;
            case 4: System.out.println("Jueves");
            break;  
            case 5: System.out.println("Viernes");
            break;
            case 6: System.out.println("Sabado");
            break;  
            case 7: System.out.println("Domingo");
            break;
            default: System.out.println("No valido");

        }


        }

      
    }
    

