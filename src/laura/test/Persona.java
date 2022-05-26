package laura.test;

public class Persona {
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void saludar() {
		System.out.println("Hola");
	}

	public static void saludar(Persona persona) {
		persona.saludarThis();
	}

	private void saludarThis() {
		System.out.println("Hola");
	}
}
