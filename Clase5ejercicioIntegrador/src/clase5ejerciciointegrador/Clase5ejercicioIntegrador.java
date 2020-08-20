/* el cálculo del promedio de tres notas de un alumno y la
definición de la condición final de acuerdo con el promedio. */
package clase5ejerciciointegrador;

import java.util.Scanner;

/*Lo resolvemos mediante metodos */
// Subproblema 1: entrada de datos (nota 1, nota 2 y nota 3).
// Subproblema 2: cálculo del promedio.
// Subproblema 3: cálculo de la condición del alumno.
// Subproblema 4: salida de resultados.
public class Clase5ejercicioIntegrador {

    //Variables Globales
    static float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
    static Scanner teclado = new Scanner(System.in);
    static String condicionAlumno = "";

    //Algoritmo principal
    public static void main(String[] args) {
        //invocamos a los subalgoritmos
        solicitarNotas();
        calcularPromedio();
        validarCondicion();
        mostrarResultados();
    }

    // Subproblema 1: entrada de datos (nota 1, nota 2 y nota 3).
    public static void solicitarNotas() {
        System.out.println("Ingrese la nota 1");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3 = teclado.nextFloat();
    }

    // Subproblema 2: cálculo del promedio.
    public static void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    // Subproblema 3: cálculo de la condición del alumno.
    public static void validarCondicion() {
        if (promedio >= 7) {
            condicionAlumno = "Aprobado";
        } else {
            condicionAlumno = "Desaprobado";
        }
    }

    // Subproblema 4: salida de resultados.
    public static void mostrarResultados() {
        System.out.println("Las notas del alumno son : " + nota1 + " - " + nota2 + " - " + nota3);
        System.out.println("El promedio del alumno es : " + promedio);
        System.out.println("La condicion del alumno es : " + condicionAlumno);
    }

}
