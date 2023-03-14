package br.com.alura;

import java.util.ArrayList;

public class clase4 {
	
	public static void main(String[] args) {
		ListaConObjetosClase4 curso1 = new ListaConObjetosClase4("Geometria", 30);
		ListaConObjetosClase4 curso2 = new ListaConObjetosClase4("Fisica", 10);
		ListaConObjetosClase4 curso3 = new ListaConObjetosClase4("Quimica", 20);
		ListaConObjetosClase4 curso4 = new ListaConObjetosClase4("Historia", 50);
		
		ArrayList<ListaConObjetosClase4> cursos = new ArrayList<>();  //Se crea un nuevo ojeto Lista de tipo : ListaConObjetosClase4
		cursos.add(curso1);					//Instanciamos la lista y agregamos a la lista con el metodo add. 
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		System.out.println(cursos);
		
		//Se agrega un nuevo curso
		cursos.add(new ListaConObjetosClase4("Aritmetica", 40)); //instranciamos la lista y agregamos 
		System.out.println(cursos);
	}
}
