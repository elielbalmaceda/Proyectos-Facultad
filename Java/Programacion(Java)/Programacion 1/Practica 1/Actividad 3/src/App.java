import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner (System.in);
System.out.println("ingrese cantidad de bancos");
int bancos=teclado.nextInt();
System.out.println("ingrese cantidad de alumnos");
int alumnos=teclado.nextInt();
int resta=alumnos-bancos;
if (alumnos<=bancos){
    System.out.println("no hacen falta bancos");
}
else{
System.out.println("faltan"+ resta + "bancos");
    }
}
    }
