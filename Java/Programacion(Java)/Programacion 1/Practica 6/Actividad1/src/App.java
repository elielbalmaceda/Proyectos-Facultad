import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int num1;
        do{
            System.out.println("Ingresar un numero entre 0 a 999:");
            num1=leer.nextInt();
 if(num1<10){ 
    System.out.println("entonces es de 1 digito");
}
else if (num1<100){
    System.out.println("entonces es de 2 digitos");
}
else if (num1<1000){
    System.out.println("entonces es de 3 digitos");
}
}  
 while (num1!=0);        
}
}