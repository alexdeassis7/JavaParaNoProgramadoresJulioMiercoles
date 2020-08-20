package clase5subalgoritmoss;
//import java.util.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Clase5SubAlgoritmoss {

// FUNCION PRINCIPAL
    public static void main(String[] args) {

      

        Scanner teclado = new Scanner(System.in);
        int precioProducto = 0;
        System.out.println("ingrese el precio del producto ");
        System.out.print("$");
        precioProducto = teclado.nextInt();
        //invocamos a laq funcion iva 
        double valorRetorno = iva(precioProducto);
        System.out.println("el precio final de su producto es " + (precioProducto + valorRetorno));
        //invocamos a el procedimiento ejecutar ()
        System.out.println("Invocacion 1");
        ejecutar();
        System.out.println("Invocacion 1");
        ejecutar();
        

    }

    // Definimos nuestra primer Procedimimento (es void , y no retorna valor )
    public static void ejecutar() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    // Definimos nuestra primer funcion
    // Una funcion siempre retorna un valor!
    public static double iva(int valor) {
        // Cuerpo de la funcion
        double porcentaje = 0.21;
        double resultado = valor * porcentaje;
        return resultado;//valor retornado 
    }

}
