/*Un maestro desea saber que porcentaje de hombres y que 
porcentaje de mujeres hay en un grupo de estudiantes */
package clase2;
import java.util.Scanner;
public class Clase2 {  
    public static void main(String[] args) {
        //defino mis variables de trabajo
        float num_hombres = 0 , num_mujeres = 0 , totalAlumnos = 0 , porcetajeH = 0 , porcetajeM =0; 
        Scanner teclado = new Scanner (System.in);      
        //solicitamos datos al usuario 
        System.out.println("Ingrese la cantidad de mujeres");
        num_mujeres = teclado.nextFloat();
        System.out.println("Ingrese la cantidad de hombres");
        num_hombres = teclado.nextFloat();        
        //porcesamos la infomarcion 
        totalAlumnos = num_hombres + num_mujeres ;
        porcetajeH = num_hombres * 100 / totalAlumnos;
        porcetajeM = num_mujeres * 100 / totalAlumnos;
        //mostramos los resultados por pantalla 
        System.out.println("El porcentaje de mujeres es :"+ porcetajeM);
        System.out.println("El porcentaje de hombres es :" + porcetajeH);

    }
    
}
