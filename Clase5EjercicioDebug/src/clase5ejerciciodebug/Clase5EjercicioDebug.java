package clase5ejerciciodebug;

import java.util.Scanner;

public class Clase5EjercicioDebug {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = 0, n2 = 0, resultado = 0;
        System.out.println("ingrese un numero para dividirlo");
        n1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero para dividirlo");
        n2 = teclado.nextInt();
        resultado = n1 / n2;
        System.out.println("resultado de la division : " + n1 + " / " + n2 + " = " + resultado);
        int cantidadElementos = 0;
        System.out.println("Ingrese la cantidad de numeros aleatorios a generar");
        cantidadElementos = teclado.nextInt();
        int num_aleatorios[] = new int[cantidadElementos];
        for (int i = 0; i < num_aleatorios.length; i++) {
            num_aleatorios[i] = (int) (Math.random() * 100);
        }
        System.out.println("Mostramos el array ");
        for (int i = 0; i < num_aleatorios.length; i++) {
            System.out.println("num_aleatorios [" + i + "] =" + num_aleatorios[i]);
        }
    }

}
