/*2)	Leer 10 números y obtener su cubo y su cuarta*/
package clase3estructurarepetitivadowhile;
import java.util.Scanner;
public class Clase3EstructuraRepetitivaDoWhile {
    public static void main(String[] args) {
       int contador =  1;
       float cubo = 0 , cuarta = 0 , numeroIngresado = 0 ;
      
       Scanner teclado = new Scanner(System.in);
       System.out.println("Inicio del Do While");
        do {
            System.out.println("Ingrese el numero que desea conocer el cubo y la cuarta");
            numeroIngresado = teclado.nextFloat();
            //calculamos el cubo y la cuarta
            cubo = numeroIngresado * numeroIngresado * numeroIngresado;
            cuarta = cubo * numeroIngresado ;
            System.out.println("Cubo : "+ cubo +"\nCuarta : " + cuarta);        
            contador ++ ;
        }while(contador <= 10 );
        
    //Tambien se puede realizar estructuctura
//        while(contador <= 10 ){
//            System.out.println("Ingrese el numero que desea conocer el cubo y la cuarta");
//            numeroIngresado = teclado.nextFloat();
//            //calculamos el cubo y la cuarta
//            cubo = numeroIngresado * numeroIngresado * numeroIngresado;
//            cuarta = cubo * numeroIngresado ;
//            System.out.println("Cubo : "+ cubo +"\nCuarta : " + cuarta);    
//            
//            contador ++;
//            
//        }
        
        System.out.println("Fin del Do While");
        
    }
    
}
