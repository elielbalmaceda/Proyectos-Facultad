//Ejercicio del final 1
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer= new Scanner(System.in);
        double[] Notas= new double [10];
        String[] Alumnos= new String [10];
        int r=0;
    System.out.println("Ingresar las notas");
        for (int i=0;i< Notas.length;i++){
    Notas[i]=leer.nextInt();
    if (Notas[i]<0 || Notas[i] >10){
    System.out.println("Nota invalida, por favor ingresar otra");
    Notas[i]=leer.nextInt();
}   
}
    System.out.println("Ingresar los alumnos:");
      int x=0;
    for (String e:Alumnos){
    Alumnos[x] = leer.nextLine();
    x+=1;
}
System.out.println("Lista:" );
for(int p=0 ;p < Notas.length; p++ ){

if(Notas[p]>= 0 && Notas[p]>5.99){
    System.out.println(Alumnos[p]+ ":" + "No aprobado");
}
else if (Notas[p]>=6 && Notas[p]>=6.99){
    System.out.println(Alumnos[p] + ":" + "Aprobado bueno");
}
else if (Notas[p]>=7 && Notas[p]>=8.99){
    System.out.println(Alumnos[p] + ":" + "Notable");
}
else if (Notas[p]>=9 && Notas[p]>=10){
    System.out.println(Alumnos[p] + ":" + "Sobresaliente");
}
}       
}
}