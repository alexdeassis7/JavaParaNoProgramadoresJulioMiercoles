/*1) Determinar si un alumno aprueba un curso de programación, 
sabiendo que aprobara si su promedio de tres calificaciones es 
mayor o igual a 7; reprueba en caso contrario. */
package clase2ejerciciocondicional;

import java.util.Scanner;

public class Clase2EjercicioCondicional {

    public static void main(String[] args) {
        //defino mis variables de trabajo 
        float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al usuario 
        System.out.println("Ingrese la nota 1");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3 = teclado.nextFloat();
        //calculamos el promedio 
        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Alumno aprobado , promedio : " + promedio);
        } else {
            System.out.println("Alumno Reprobado , promedio : " + promedio);
        }

    }

}
