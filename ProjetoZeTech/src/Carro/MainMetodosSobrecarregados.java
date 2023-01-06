package Carro;

public class MainMetodosSobrecarregados {

	public static void main(String[] args) {
		MetodoSobrecarregado metodo01 = new MetodoSobrecarregado();
		
		metodo01.salario(5000);
		metodo01.salario(7500.50);
		
		System.out.println("--------------");
		
		metodo01.testaMetodosSobrecarregados();

	}

}
