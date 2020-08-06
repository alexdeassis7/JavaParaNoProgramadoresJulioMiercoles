/*2) Desarrollar un algoritmo que permita ingresar letras mayúsculas y que
las muestre por pantalla. El programa debe finalizar cuando se hayan
ingresado 10 letras mayúsculas.
 */
package clase3ejerciciodowhile;
import java.util.Scanner;
public class Clase3EjercicioDoWhile {

    public static void main(String[] args) {
        int limite = 10, contador = 1;
        char letra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Letras Mayusculas, El Programa "
                + "Finalizara cuando se hayan ingresado " + limite + " letras mayusculas");        
        do {
            do {
                letra = teclado.next().charAt(0);
               // boolean t = (letra >= 'A' && letra <= 'Z');
              //  System.out.println("letra mayuscula ???" + t  );
                        
              //  System.out.println("letra.equals(letra.toUpperCase())" +letra.equals(letra.toUpperCase()));
           } while (!(letra >= 'A' && letra <= 'Z'));
            //} while (!Character.isUpperCase(letra));
            
            System.out.println("Letra Mayuscula : " + letra);
            contador++;
        } while (limite >= contador);

    }

}
