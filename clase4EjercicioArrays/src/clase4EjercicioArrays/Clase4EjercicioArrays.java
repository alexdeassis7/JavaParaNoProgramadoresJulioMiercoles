package clase4EjercicioArrays;

/*1)	Calcular el promedio de 50 valores almacenados en un Vector. 
Determinar además cuantos son mayores que el promedio, 
imprimir el promedio, y una lista de valores mayores que el promedio .*/
public class Clase4EjercicioArrays {

	public static void main(String[] args) {
		float[] arrayValores = new float[50];
		float[] arrayDeValoresMayoresAlPromedio;

		float sumatoria = 0, promedio = 0;
		int cantidadDeDatosMayoresAlPromedio = 0;
		// cargamos el array con dato de forma aleatoria
		for (int i = 0; i < arrayValores.length; i++) {
			arrayValores[i] = (float) Math.random() * 100 + 1;
			sumatoria += arrayValores[i];

		}

		promedio = sumatoria / arrayValores.length;// calculo el promedio
		System.out.println("el promedio es :" + promedio);
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				cantidadDeDatosMayoresAlPromedio++;
			}
		}
		arrayDeValoresMayoresAlPromedio = new float[cantidadDeDatosMayoresAlPromedio];

		int j = 0;
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				arrayDeValoresMayoresAlPromedio[j] = arrayValores[i];
				j++;
			}
		}

		System.out.println("la cantidad de datos mayores que el promedio es : " + cantidadDeDatosMayoresAlPromedio);
		System.out.println("vector con datos iniciales");
		for (int i = 0; i < arrayValores.length; i++) {
			System.out.println(arrayValores[i]);

		}
		System.out.println("estos son los datos del vector que tiene todos los valores mayores al promedio ");
		for (int i = 0; i < arrayDeValoresMayoresAlPromedio.length; i++) {
			System.out.print(arrayDeValoresMayoresAlPromedio[i] + " - ");
		}

	}

}
