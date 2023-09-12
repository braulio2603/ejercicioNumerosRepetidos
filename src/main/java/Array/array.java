package Array;

import java.util.Arrays;

public class array {
    public static int [] arregloNumeros;
    private int contador;

    public array(int sizeArray){
        this.contador =0;
        this.arregloNumeros = new int[sizeArray];
            }
    public void setArregloNumeros(int tamaño){
        if(contador < arregloNumeros.length){
            arregloNumeros[contador] = tamaño;
            contador++;
        }
    }
    public int [] getArregloNumeros(){
        return arregloNumeros;
    }
}
