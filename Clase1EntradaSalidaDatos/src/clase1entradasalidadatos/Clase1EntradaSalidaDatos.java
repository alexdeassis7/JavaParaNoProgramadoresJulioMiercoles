package clase1entradasalidadatos;

import java.util.Scanner;//importamos una dependencia 

/*Suponga que un individuo desea invertir su capital en un banco y desea 
saber cuanto dinero ganara despues de un mes si el banco paga
a razon de 2% Mensual */
public class Clase1EntradaSalidaDatos {

    public static void main(String[] args) {
        //el main es el punto de inicio de nuestra App
        //definimos las variables de trabajo 
        float capital = 0, ganancia = 0;
        Scanner teclado = new Scanner(System.in);//defino un scanner para poder leer datos desde el teclado 
        //mostramos un mensaje al usuario 
        System.out.println("Ingrese el capital que desea invertir en el banco ");
        //tomamos un dato por teclado y lo guardamos en la variable "capital" 
        capital = teclado.nextFloat();
        //procesamos la informacion (calculamos la ganancia)
        ganancia = capital * 0.02f;
        //mostramos los resultado por consola 
        System.out.println("La ganancia mensual es : " + ganancia );
        
    }

}
