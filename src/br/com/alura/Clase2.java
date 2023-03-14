package br.com.alura;

import java.util.ArrayList;

public class Clase2 {
	public static void main(String[] args) {
		String variable1 = "clase1";
		String variable2 = "clase2";
		String variable3 = "clase3";
		String variable4 = "clase4";
		
		ArrayList<String> listaString = new ArrayList<>(); //Se crea una variable de tipo ArrayList: String = new ObjetArrayList
		listaString.add(variable1);						 //Instancia del nuevo objeto lista con su metodo add().
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
		System.out.println(listaString);
		
		//TRES FORMAS DIFERENTES DE LEER UN ARREGLO.
		
//		for (int i = 0; i < listaString.size(); i++) {  //recorre un lista. 
//			System.out.println(listaString.get(i));
//		}
		
//		for (String clase : listaString) {			//foreach recorre lista.
//			System.out.println(clase);
//		}
		
		//java8
		
		listaString.forEach( clase -> {			//lambda permite leer una lista.
			System.out.println(clase + "lambda");
		});
	}
}
