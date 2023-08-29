public class App {
    public static void main(String[] args) throws Exception {
        int []numeros1= {1,2,3,4,5};
        int []numeros2= new int[5];
        int l=1, j=0;
        for ( int i = 4; i < numeros1.length; i--) {
            numeros2[j] = numeros1[i];

            System.out.println("Lugar " + l + " del primer array: " + numeros1[j]);
            System.out.println("Lugar " + l + " del segundo array: " + numeros2[j] + "\n");
            j += 1;
            l += 1;
          
    }
}
}