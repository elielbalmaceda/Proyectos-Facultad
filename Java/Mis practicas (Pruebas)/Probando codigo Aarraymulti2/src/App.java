public class App {
    public static void main(String[] args) throws Exception {
  /*   //two dimensional array definition
int[][] myarray = new int[3][3];
//printing the 2-d array
System.out.println("The two-dimensional array:");
for (int i = 0; i <myarray.length; i++) {
for (int j = 0; j <myarray [i].length; j++) {
myarray[i][j] = j+1; //assign value to each array element
System.out.print(myarray[i][j] + " ");
}System.out.println("");*/

//Declare un array de tipo String
    String[][]nomArray = new String[2][2]; 
   
// Utilizamos 2 for para recorrer el Array bidimensional
    for (int i=0; i < nomArray.length; i++ ){
     for(int k=0; k < nomArray[i].length; k++){
        System.out.println(nomArray[i][k] + " ");
     }
        
    }
}
}

   
