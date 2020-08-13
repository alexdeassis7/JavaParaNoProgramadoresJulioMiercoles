package clase4.arrays;
import java.util.Scanner;public class Clase4Arrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in) ;
        
        float tempMax = 0;
        
        for (int i = 1; i <= 31; i++) {
            System.out.println("ingrese la temperatura maxima del dia " + i + "agosto ");
            tempMax = teclado.nextFloat();
        }
        
    }
    
}
