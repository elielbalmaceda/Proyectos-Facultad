import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //1)Solicitar al operador que ingrese un número entero entre 5 y 9.
int num;
do{
    System.out.println("Ingrese un número entre 5 y 9");
num = manu.nextInt();
if (num > 5  ||  num < 9){
    System.out.println("Número valido");
}else{
    System.out.println("Invalido, ingrese un número correcto");
}
}while (num < 5 || num > 9);
 System.out.println("El número elegido es: " + num);
 
 float[] elementos = {1.2f,2.4f,3.6f,4.8f,6.0f,7.2f};
 for(float i: elementos){
    System.out.println(i + "\n");
 }
}
   }
        
        



    
