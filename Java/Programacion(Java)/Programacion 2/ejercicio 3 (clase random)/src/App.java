// ejercicio 3
public class App {
    public static void main(String[] args) throws Exception {
    int [] Array =new int[100];
    int suma=0;
    int media;
    for(int i=0; i<Array.length; i++){
        Array[i]= i + 1;
        suma+=Array[i];
    }
    media = suma/100;
System.out.println("suma de numeros es:" + suma + "la media de los numeros son:"+ media);
    }
}
