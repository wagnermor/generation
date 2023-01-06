package POOJava05Exercicios;

public class TestaCurso {

	public static void main(String[] args) {
		Curso poo = new Curso(
				"Java for Sêniors",
				"Mr. Gerreiro",
				"Das 8h às 15h - SEG à SEX",
				360,
				40,
				5000.99
				);
		
		Curso poo2 = new Curso(
				"Java for begeners",
				"Mrs. Thompson",
				"Das 8h às 15h - SEG à SEX",
				300,
				30,
				6000.99
				);
		poo.visualizar();
		poo2.visualizar();
	}
}
