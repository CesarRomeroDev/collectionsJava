package br.com.alura;

import java.util.ArrayList;

public class Ejemplo1 {
	public static void main(String[] args) {
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";
		
		ArrayList<String> lista = new ArrayList<>(); //Se crea una variable de tipo ArrayList: String = new ObjetArrayList
		lista.add(variable1);						 //Instancia del nuevo objeto lista con su metodo add().
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		System.out.println(lista);
		
		lista.remove(2);			//remover un index de la instancia lista.
		System.out.println(lista);
		
		lista.set(2, "Ejemplo alterado");		//lista.set modifica el index 2 , "Nuevo nombre".
		System.out.println(lista);
		
		System.out.println(lista.size()); 		//retorna el tamaño de nuestra lista.
		
		
	}
}
