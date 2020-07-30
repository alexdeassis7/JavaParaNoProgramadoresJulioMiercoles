package clase2ifelseinline;

public class Clase2IfElseInline {

    public static void main(String[] args) {
        int a = 10, b = 8888, max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        // operador Ternario
        max = (a > b  ) ? a : b ;   // (condicion) ? valor1    : valor2 ;
        System.out.println("el mayor es " + max);

    }

}
