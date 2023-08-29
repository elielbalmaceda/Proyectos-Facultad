import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner pirulo=new Scanner(System.in);
        int i=0;
        String [] marca = new String[4];

        for (i=0;i < marca.length; i++){
        System.out.println("INGRESA 4 MARCAS");
        marca[i]= pirulo.nextLine();

    }
     for (int j = 0; j < marca.length; j++) {
        System.out.println("las marcas ingresadas son :" + marca[j]);
     }
    }


}