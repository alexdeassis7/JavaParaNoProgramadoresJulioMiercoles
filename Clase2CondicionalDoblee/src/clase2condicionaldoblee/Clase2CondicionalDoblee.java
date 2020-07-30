package clase2condicionaldoblee;

import java.util.Scanner;

/*desarrollar un algoritmo que permita determinar si un 
numero ingresado por teclado es positivo o negativo */
public class Clase2CondicionalDoblee {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero distinto de  cero");
        numeroIngresado = teclado.nextInt();

        if (numeroIngresado > 0){ 
            System.out.println("el numero ingresado es POSITIVO ");
        }else{ 
             System.out.println("el numero ingresado es NEGATIVO ");
        }

    }

}
