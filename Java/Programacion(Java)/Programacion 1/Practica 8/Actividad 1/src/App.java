public class App {
    public static void main(String[] args) throws Exception {
                int contador = 0;
                int contadorposi = 0;
                boolean[] cifraButacas = { true, true, true, false, true, true, false, false, true, false, true, false, false,
                        true,
                        true, true, false, true, true,
                        false };
        
                for (int i = 0; i < cifraButacas.length; i++) {
                    if (cifraButacas[i] == false) {
                        contador++;
                    } else {
                        contadorposi++;
                    }
        
                }
                System.out.println("la cantidad de butacas disponibles es : " + contador);
                System.out.println("la cantidad de butacas ocupadas es : " + contadorposi);
        
            }
        }
