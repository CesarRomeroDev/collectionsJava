package br.com.alura;

public class ListaConObjetosClase4 {  //implements Comparable<ListaConObjetosClase4> comparable: se usa para los array para mover de posicion

	private String nombre;
	private int tiempo;
	
	//Constructor.
	public ListaConObjetosClase4( String nombre, int tiempo ) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	
	
	public int getTiempo() {
		return this.tiempo;
	}
	public void setTiempo( int tiempo ) {
		this.tiempo = tiempo;
	}
	
	@Override	//sobreescribe el metodo que viene por defecto en la clase ListaConObjetosClase4, que devuelve una representación del objeto como String
	public String toString() {
		return this.nombre;
	}

//	@Override	//para usa cuando implements Comparable
//	public int compareTo(ListaConObjetosClase4 o) {
//		return this.nombre.compareTo(o.getNombre());
//	}
	
	
}
