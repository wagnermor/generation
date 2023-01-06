package POOJava05Exercicios;
import java.util.*;

public class TestaCurso {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Curso curso1 = new Curso(
				"Java for Sêniors",
				"Mr. Gerreiro",
				"Das 8h às 15h - SEG à SEX",
				360,
				40,
				5000.99
				);
		
		Curso curso2 = new Curso(
				"Java for begeners",
				"Mrs. Thompson",
				"Das 8h às 15h - SEG à SEX",
				300,
				30,
				6000.99
				);
		
		Curso curso3 = new Curso();
		
		System.out.println("Digite o nome do curso: ");
		curso3.setNome(leia.nextLine());
		System.out.println("Digite o nome do professor: ");
		curso3.setNomeProfessor(leia.nextLine());
		curso3.setValor(5500.99);
		
		curso1.visualizar();
		curso2.visualizar();
		
		curso3.visualizar();
	}
}
