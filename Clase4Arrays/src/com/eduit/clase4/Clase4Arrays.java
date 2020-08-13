package com.eduit.clase4;

import java.util.Scanner;

public class Clase4Arrays {
	/*
	 * calcular la temperatura media del mes de Agosto y la suma de todas las
	 * temperaturas del mes (la temperatura de cada dia debera ser ingresada por el
	 * usuario)
	 */
	public static void main(String[] args) {
		int diasAgosto = 31;
		// definimos e inicializamos un array de datos float
		float[] temperaturasAgosto = new float[diasAgosto];
		float sumaDeTemperaturas = 0;// variable de tipo acumulador
		float promedioTemperaturas = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("cantidad De elementos del Array " + temperaturasAgosto.length);
		// Cargamos todo nuestro array con las temperatura que ingresa el usuairo por
		// teclado
		for (int indice = 0; indice < temperaturasAgosto.length; indice++) {
			System.out.println("ingrese la temperatura maxima del dia " + (indice + 1));
			temperaturasAgosto[indice] = teclado.nextFloat();
			// acumulamos todas las temperaturas en la variable "sumaDeTemperaturas"
			// sumaDeTemperaturas = sumaDeTemperaturas + temperaturasAgosto[indice] ;
			sumaDeTemperaturas += temperaturasAgosto[indice];
		}
		System.out.println("Suma de temperaturas de de agosto es :" + sumaDeTemperaturas);
		// calculamos y mostramos el promedio de las temperaturas del mes de agosto
		promedioTemperaturas = sumaDeTemperaturas / temperaturasAgosto.length;
		System.out.println("la temperatura promedio de agosto fue de  : " + promedioTemperaturas);
		System.out.println("*************** MOSTRAMOS EL ARRAY DE TEMPERATURAS ***************");
		// recorremos el array con un for y mostramos el contenido del mismo
		for (int i = 0; i < temperaturasAgosto.length; i++) {
			System.out.print(temperaturasAgosto[i] + " - ");
		}

	}

}
