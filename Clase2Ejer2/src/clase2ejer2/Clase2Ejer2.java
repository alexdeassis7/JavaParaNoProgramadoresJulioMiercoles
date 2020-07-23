/*Una Tienda ofrece un descuento del 15% sobre el total de la compra y un 
cliente desea saber cuanto debera pagar finalmente por su compra  */
package clase2ejer2;

import java.util.Scanner;

public class Clase2Ejer2 {

    public static void main(String[] args) {
        //Defino  mis variabels de trabajo 
        float totalCompra = 0, descuento = 0, totalApagar = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos datos al user
        System.out.println("Ingrese el total de su compra");
        totalCompra = teclado.nextFloat();
        //proceso la informacion 
        descuento = totalCompra * 0.15f;
        totalApagar = totalCompra - descuento;
        //salida de informacion
        System.out.println("el total a pagar con el descuento del 15% es $" + totalApagar);

    }

}
