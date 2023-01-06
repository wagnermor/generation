package Carro;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados() {
		System.out.printf("Salário em número inteiro: %d \n", salario(1000));
		System.out.printf("Salário em número inteiro: %.2f \n", salario(7.500));
	}
	
	public int salario(int valorInt) {
		System.out.printf("Salário com argumento inteiro: %d\n", valorInt);
		return valorInt * valorInt;
	}
	
	public double salario(double valorDouble) {
		System.out.printf("Salário com argumento double: %.3f\n", valorDouble);
		return valorDouble * valorDouble;
	}
}
