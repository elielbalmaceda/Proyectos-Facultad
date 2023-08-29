public class App {
    public static void main(String[] args) throws Exception {
        int cont = 0;
        boolean[] butacas ={true, false, false, true, false, true, false, true, true, false, true, false, false};

        for(int i = 0;i < butacas.length; i++){
            if (butacas[i] == false) cont++;
        }
        System.out.println("Numero de butacas disponibles  " + cont);
    }
}
