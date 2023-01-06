package Carro;

public class MainCarro {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		
		fusca.cor = "Vinho";
		fusca.modelo = "Fusca";
		fusca.velocidadeAtual = 0;
		fusca.velocidadeMaxima = 80;
		 
		fusca.liga();
		
		fusca.acelera(20);
		System.out.println(fusca.velocidadeAtual);
	}

}
