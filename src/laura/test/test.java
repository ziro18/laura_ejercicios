package laura.test;

public class test {

	public static void main(String[] args) {

		Persona.saludar();

		Persona.saludar(new Persona("lala"));

		Persona lulu = new Persona("lulu");
		lulu.saludar();

	}
}
