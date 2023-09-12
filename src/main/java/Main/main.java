package Main;

import Array.array;
import verDuplicados.opVerDuplicados;

import java.util.Scanner;

import static Array.array.arregloNumeros;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo: ");
        array arr = new array(scanner.nextInt());
        capValor(new Scanner(System.in), arr);
        opVerDuplicados.iterar();
    }
    public static void capValor(Scanner scanner, array arr){
        int contador = 0;
        try{
        while(contador< arr.getArregloNumeros().length) {
            System.out.println("Registra un valor entero al arreglo");
            arr.setArregloNumeros(scanner.nextInt());
            contador++;
        }
        }catch (Exception e){
            System.out.println("Error en la captura");
        }
    }
}
