/*2)	Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno 
del vector A con el elemento uno del vector B y así sucesivamente hasta 45, almacenar
el resultado en un vector C, e imprimir el vector resultante por pantalla. */
package clase5ejercicio2vectoress;

public class Clase5Ejercicio2Vectoress {

    public static void main(String[] args) {
        int dimension = 45;
        int[] vectorA = new int[dimension];
        int[] vectorB = new int[dimension];
        int[] vectorC = new int[dimension];

        // Cargamos el vector A y B de manera Aleatoria (Math.random)
        for (int i = 0; i < dimension; i++) {
            vectorA[i] = (int) (Math.random() * 100);
            vectorB[i] = (int) (Math.random() * 100);
            vectorC[i] = vectorA[i] + vectorB[i];// sumamos a + b = c
            System.out.println(vectorA[i] + " + " + vectorB[i] + " = " + vectorC[i]);
        }/*
		System.out.println("vector A");
		// recorremos los vectores para ver que datos tienen cargados
		for (int i = 0; i < dimension; i++) {
			System.out.print(vectorA[i] + " - ");

		}
		System.out.println(" ");
		System.out.println("Vector B");
		for (int i = 0; i < dimension; i++) {
			System.out.print(vectorB[i] + " - ");

		}
		System.out.println(" ");
		System.out.println("Vector C");
		for (int i = 0; i < dimension; i++) {
			System.out.print(vectorC[i] + " - ");

		}*/
    }

}
