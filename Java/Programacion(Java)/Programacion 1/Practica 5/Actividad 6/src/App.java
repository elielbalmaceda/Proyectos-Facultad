import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan =new Scanner(System.in) ;
       int positivos=0, negativos=0, suma=0, i=1 ;
       
for (i=0;i<=10;i++){
System.out.println("ingrese numeros");
int num = scan.nextInt();
if(i<0)
positivos++;
else
negativos--;
suma= suma+ i;
}
System.out.println("resultado es : " + suma);
System.out.println("cantidad de postivos es : " + positivos);
System.out.println("cantidad de negativos es : " + negativos);
    
}
}