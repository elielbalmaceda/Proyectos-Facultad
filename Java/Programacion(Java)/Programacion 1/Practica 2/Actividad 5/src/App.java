import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner pirulo= new Scanner(System.in);
    int num1 ,num2,num3,suma, multi;
    System.out.println("escribi primer numero");
    num1=pirulo.nextInt();                            
    System.out.println("escribi segundo numero");
    num2=pirulo.nextInt();
    System.out.println("escribi tercero numero");
    num3=pirulo.nextInt();
    if (num1<0){
        System.out.println(multi=num1*num2*num3);   
    }else {
        System.out.println(suma=num1+num2+num3);
    }
}
}
