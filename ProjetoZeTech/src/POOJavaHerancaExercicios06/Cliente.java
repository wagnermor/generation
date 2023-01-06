package POOJavaHerancaExercicios06;

public class Cliente {
	private String nome;
	private String telefone;
	private String email;
	private String rua;
	private int numeroCasa;
	private Integer cep;
	
	public Cliente(
			String nome,
			String telefone,
			String email,
			String rua,
			int numeroCasa,
			Integer cep
			) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	public void visualizar() {
		System.out.printf("\n\tNome: %s\n\tTelefone: %s\n\tE-mail: %s\n\tEndereço: %s, %d - CEP %d\n",
				getNome(),getTelefone(),getEmail(), getRua(), getNumeroCasa(),getCep());
	}
}
