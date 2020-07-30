package clase2estructuracondinalmultiple;

import java.util.Scanner;

public class Clase2estructuraCondinalMultiple {

    public static void main(String[] args) {
        int opcionIngresada = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese por favor una opcion \n ");
        opcionIngresada =teclado.nextInt();
        System.out.print(" 1.SUMAR \n 2.RESTAR \n 3.DIVIDIR \n 4.MULTIPLICAR\n");
       
        switch (opcionIngresada) {
            case 1:
                System.out.println("Usted selecciono la opcio uno");
                break;
            case 2:
                System.out.println("Usted selecciono la opcio dos");
                break;
            case 3:
                System.out.println("Usted selecciono la opcio tres");
                break;
            case 4:
                System.out.println("Usted selecciono la opcio cuatro ");
                break;
            default:
                System.out.println("La opcion " + opcionIngresada + " No es una opcion VALIDA");

        }
        
        System.out.println("Fin del programa ");
    }

}
