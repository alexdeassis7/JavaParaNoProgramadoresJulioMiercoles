package clase2estructuracondinalmultiple;

import java.util.Scanner;

public class Clase2estructuraCondinalMultiple {

    public static void main(String[] args) {
        float numero1 = 0, numero2 = 0, resultado = 0;
        int opcionIngresada = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese por favor una opcion \n ");
        System.out.print(" 1.SUMAR \n 2.RESTAR \n 3.DIVIDIR \n 4.MULTIPLICAR\n");
        opcionIngresada = teclado.nextInt();

        if (opcionIngresada >= 1 && opcionIngresada <= 4) {
            System.out.println("Ingrese el numero1");
            numero1 = teclado.nextInt();
            System.out.println("Ingrese el numero2");
            numero2 = teclado.nextInt();
        }

        switch (opcionIngresada) {
            case 1:
                System.out.println("Usted selecciono la opcion SUMA");
                resultado = numero1 + numero2;
                break;
            case 2:
                System.out.println("Usted selecciono la opcion RESTA");
                resultado = numero1 - numero2;
                break;
            case 3:
                System.out.println("Usted selecciono la opcion DIVIDIR");
                if (numero2 == 0) {
                    System.out.println("NO podes dividir por cero en los num Reales");
                } else {
                    resultado = numero1 / numero2;
                }
                break;
            case 4:
                System.out.println("Usted selecciono la opcion MULTIPLICAR ");
                resultado = numero1 * numero2;
                break;
            default:
                System.out.println("La opcion " + opcionIngresada + " No es una opcion VALIDA");

        }
        if (opcionIngresada >= 1 && opcionIngresada <= 4 ) {
            System.out.println("resultado :" + resultado);
        }
        System.out.println("Fin del programa ");
    }

}
