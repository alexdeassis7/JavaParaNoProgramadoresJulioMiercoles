/*4)	Leer 20 números e imprimir cuantos son positivos ,
cuantos negativos y cuantos neutros */
package clase3estructurafor;

import java.util.Scanner;

public class Clase3EstructuraFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0;
        int cantPositivos = 0, cantNegativos = 0, CantNeutros = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingrese el numero " + i);
            numeroIngresado = teclado.nextInt();
            //validamos si el numero es positivo , negativo o neutro
            if (numeroIngresado > 0) {
                cantPositivos++;
            } else if (numeroIngresado < 0) {
                cantNegativos++;
            } else {
                CantNeutros++;
            }
        }

        System.out.print("Negativos : " + cantNegativos + "\nPositivos :" + cantPositivos + "\n Neutros : " + CantNeutros);

    }

}
