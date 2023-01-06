package POO;

public class Pessoa {

	private String primeiroNome;
	private String ultimoNome;
	private String nomeDoMeio;
	
	public Pessoa(String primeiro, String meio, String ultimo) {
		this.primeiroNome =  primeiro;
		this.nomeDoMeio = meio;
		this.ultimoNome = ultimo;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto;
		
		nomeCompleto = primeiroNome + " " + nomeDoMeio + " " + ultimoNome;
		return nomeCompleto;
	}
}
