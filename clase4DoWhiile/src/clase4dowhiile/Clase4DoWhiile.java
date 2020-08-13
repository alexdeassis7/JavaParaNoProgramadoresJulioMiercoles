package clase4dowhiile;

public class Clase4DoWhiile {
//Imprimir los números del 1 al 10 sin imprimir números 2,5 y 9 uno abajo del otro
    public static void main(String[] args) {
                    int n = 1;//contador 
        
        while (n <= 10){
            
           if ((n != 2) && (n != 5) && (n != 9)) {  // (true)&&(false )&&(true )
                System.out.println(n);
            }
            n++;//iteramos el contador ,para no caer en un LOOP infinito
        }

    }

}
