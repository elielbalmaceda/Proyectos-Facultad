public class App {
//Ejercicio 2
    public void baffle(String blimp) {// 7 Encuentra el metodo
    System.out.println(blimp);//8 imprime por pantalla el valor de blimp
    zippo("ping", -5);//9 vuelve a ejecutar la funcion zippo con diferentes parametros 
    }

    public void zippo(String quince, int flag) { // 2  y 10
        if (flag < 0) { //3 Se evalua la condicion, false. 11 TRUE
            System.out.println(quince + "zoop");
             // 12 Imprime la variable quince ("ping" pasado por parametro) + "zoop". = pingzoop
        } else { // 4 

        System.out.println("ik"); //5

        baffle(quince); // 6 invoca al metodo baffle
        System.out.println("boo-wa-ha-ha"); //13
        }
    }
   
    public void main(String[] args) { 
    //1 La primer linea que se ejecuta es el metodo main que invoca al metodo zippo
    zippo("rattle", 13);
    
 
    }
}
// 2. El valor de "blimp" cuando se invoca al metodo "baffle" es el valor de lo que valga la variable "quince" que en este caso es: rattle.
// 3. Salida por consola: 
	// ik
	// rattle
	// pingzoop
	// boo-wa-ha-ha



    
