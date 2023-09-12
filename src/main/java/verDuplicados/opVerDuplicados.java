package verDuplicados;

import static Array.array.arregloNumeros;

public class opVerDuplicados {

    public static void iterar(){
        for (int i = 0; i < arregloNumeros.length-1; i++){
            //System.out.println("Numero en la posciciòn: " + i +" "+ arregloNumeros[i]);
            for(int j = i+1; j < arregloNumeros.length; j++){
                if (arregloNumeros[i]==arregloNumeros[j]) {
                    System.out.println("El elemento repetido: " + arregloNumeros[i] + " en la poscicion: " +i + " y " + j);
                }
            }
        }
    }
}
