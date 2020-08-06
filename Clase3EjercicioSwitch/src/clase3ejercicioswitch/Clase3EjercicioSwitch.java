/*1) Desarrollar un algoritmo que permita ingresar un número entero
comprendido entre 1 y 7, y que muestre por pantalla el día de la semana al
que se corresponde. 
 */
package clase3ejercicioswitch;

import java.util.Scanner;

public class Clase3EjercicioSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0;
        System.out.println("Ingrese un numero entero comprendido entre 1 y 7");
        numeroIngresado = teclado.nextInt();
        switch (numeroIngresado) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("No existe el dia " + numeroIngresado);

        }

        System.out.println("Fin del app ");

    }

}
