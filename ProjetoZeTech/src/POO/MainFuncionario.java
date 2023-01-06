package POO;

public class MainFuncionario {

	public static void main(String[] args) {
		Funcionario func007 = new Funcionario();
		
		func007.setNome("James Bond");
		func007.setSalario(50000.99);
		
		System.out.printf("O salário do colaborador %s é de £%.2f.", func007.getNome(), func007.getSalario());

	}

}
