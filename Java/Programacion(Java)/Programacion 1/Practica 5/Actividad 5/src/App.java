import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan =new Scanner(System.in) ;
       int contador=0, positivos=0, negativos=0, suma=0, A=0;
do{
System.out.println("ingresa numeros");
A=scan.nextInt();
contador++;
if(A>=0)
positivos++;
else
negativos--;
suma= suma+ A;
} while (contador<10);
System.out.println("resultado es : " + suma);
System.out.println("cantidad de postivos es : " + positivos);
System.out.println("cantidad de negativos es : " + negativos);
}
}

