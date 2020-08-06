/*1)Calcular el promedio de un alumno que tiene 7 
calificaciones en la materia de Diseño Estructurado de Algoritmos.
 */
package clase3ejerciciowhilee;

import java.util.Scanner;

public class Clase3EjercicioWhilee {

    public static void main(String[] args) {
        float calificacion = 0, promedio = 0, suma = 0;
        int contador = 1 , cantidadDeNotas = 7;
        
        Scanner teclado = new Scanner(System.in);

        while (contador <= cantidadDeNotas) {
            System.out.println("Ingrese la nota " + contador);
            calificacion = teclado.nextFloat();
//            suma = suma + calificacion;
            suma += calificacion;
            contador++;
//            contador += 1;
//            contador = contador +1;
        }
        System.out.println("contador: " + contador);
        //calculamos el promedio 
        promedio = suma / cantidadDeNotas;

        System.out.println("El promedio de sus notas es " + promedio);

    }

}
