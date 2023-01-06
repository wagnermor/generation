package Carro;

public class Carro {
	/*private*/ String cor;
	/*private*/ String modelo;
	/*private*/ double velocidadeAtual;
	/*private*/ double velocidadeMaxima;
	
	
	public void liga() {
		System.out.println("O carro está ligado!");
	}
	public void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	public int pegaMarcha() {
		if(this.velocidadeAtual < 0)
			return -1;
		else if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40)
			return 1;
		else if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80)
			return 2;
		
		return 3;
	}
}
