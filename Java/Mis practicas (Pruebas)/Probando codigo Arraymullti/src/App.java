//Array bidimensional
public class App {
    public static void main(String[] args) throws Exception {
            //Aca se inicializa el Arayy 2D
            int[][] myArray = { { 1, 2, 3 }, { 4, 5 } };
            System.out.println("n° de filas:" + myArray.length); //Numeros de fila que hay
            for(int i=0;i<myArray.length;i++)
            //cantidad de columnas de cada fila
            System.out.println("length of 1D array(" + (i+1) +"):" + myArray[i].length);
                /*Aca lo que hace es mostrar cuantas columnas tiene esas longitudes de array 
                En el primer caso (1D) tiene 3 filas {1 , 2, 3}
                Y el segundo tiene 2 (2d) filas {4, 5}
                */













    }
}
