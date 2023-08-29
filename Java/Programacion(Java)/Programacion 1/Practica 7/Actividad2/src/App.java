import java.util.Scanner;
public class App {
    //Practica 7 actividad 2
    public static void main(String[] args) throws Exception {
    int i;
    Scanner leer =new Scanner(System.in); 
     System.out.println("ingrese un numero");
     i=leer.nextInt();
     System.out.println("Los numeros sucesivos a " + i  +  " son:");
     for(int w=i; w<=20;w++){
      System.out.println(w);
    }
    }
}
