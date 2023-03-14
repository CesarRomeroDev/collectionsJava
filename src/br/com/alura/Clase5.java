package br.com.alura;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {

	public static void main(String[] args) {
		
		ListaConObjetosClase4 curso1 = new ListaConObjetosClase4("PHP", 30);
		ListaConObjetosClase4 curso2 = new ListaConObjetosClase4("Ruby", 10);
		ListaConObjetosClase4 curso3 = new ListaConObjetosClase4("JavaScript", 20);
		ListaConObjetosClase4 curso4 = new ListaConObjetosClase4("Java", 50);
		
		ArrayList<ListaConObjetosClase4> cursos = new ArrayList<>();  //Se crea un nuevo ojeto Lista de tipo : ListaConObjetosClase4
		cursos.add(curso1);					//Instanciamos la lista y agregamos a la lista con el metodo add. 
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		System.out.println(cursos);
		
		//Collections.sort(cursos, Collections.reverseOrder()); //se hace de esta forma cuando utilizamos Comparable em la clase padre [javaScript, java, Ruby, PHP]
		
		//cursos.sort( Comparator.comparing(ListaConObjetosClase4::getNombre));  //Para no usar Comparable en la clase padre.
		
		//Collections.sort(cursos, Comparator.comparing(ListaConObjetosClase4::getNombre).reversed()); //orden revertido.
		
		List<ListaConObjetosClase4> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(ListaConObjetosClase4::getTiempo)).collect(Collectors.toList());	//menos a mayor y se eleimina con .equalsIgnoreCase.
		
		System.out.println(cursoList);
		
		
	}
}
