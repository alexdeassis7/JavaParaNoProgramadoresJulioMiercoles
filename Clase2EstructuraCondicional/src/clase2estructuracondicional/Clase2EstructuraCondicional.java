/* Implementar un algoritmo que calcule y muestre por pantalla el valor
final de la compra de un artículo. El algoritmo debe permitir el ingreso del
precio del artículo y la cantidad de artículos. Si el subtotal es superior a
1000, entonces se debe aplicar un descuento del 10 %.
 */
package clase2estructuracondicional;

import java.util.Scanner;

public class Clase2EstructuraCondicional {

    public static void main(String[] args) {
        //definimos las variables de trabajo 
        int cantidad = 0;
        float precio = 0, descuento = 0, subtotal = 0, totalCompra = 0;
        Scanner teclado = new Scanner (System.in);
        //solicitamos los datos al usuario 
        System.out.println("ingrese el precio del articulo");
        precio = teclado.nextFloat();
        System.out.println("Ingrese la cantidad de articulos a comprar");
        cantidad = teclado.nextInt();
        //procesamos la informacion
        subtotal = precio * cantidad;
        //utilizamos un condicional simple 
        if(subtotal > 1000){
            descuento = subtotal * 0.10f ;
        } 
        totalCompra = subtotal - descuento;
        if(descuento > 0){
            System.out.println("Se aplico un descuento de $" + descuento);
        }
        System.out.println("El valor final de la compra es $ " + totalCompra);
        
        
    }

}
