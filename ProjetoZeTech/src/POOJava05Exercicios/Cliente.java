package POOJava05Exercicios;

public class Cliente {
	private String nome;
	private String eMail;
	private String bairro;
	private String cidade;
	private String estado;

	private int cep;
	private int idade;
	
	public Cliente(String nome,
			String eMail,
			String bairro,
			String cidade,
			String estado,
			int cep,
			int idade
			){
		
		super();
		this.nome = nome;
		this.eMail = eMail;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		System.out.printf("\n\tNome: %s\n\tE-mail: %s\n\tEndereço: %s - %s - %s - CEP %d\n", getNome(),
				geteMail(), getBairro(), getCidade(), getEstado(),getCep());
	}
	
	
	
	
}
