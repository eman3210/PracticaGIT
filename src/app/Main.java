package app;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("hola mundo");

		Alumno alu = new Alumno();
		
		System.out.println(alu.getName());
		
		alu.setName("Emita");
		System.out.println(alu.getName());
		System.out.println("chau!");
	}

}
