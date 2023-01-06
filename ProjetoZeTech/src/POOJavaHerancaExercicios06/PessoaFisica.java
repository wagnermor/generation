package POOJavaHerancaExercicios06;

public class PessoaFisica extends Cliente{
	private String cpf;
	private String horarioEntrega;
	
	public PessoaFisica(
			String nome,
			String telefone,
			String email,
			String rua,
			int numeroCasa,
			Integer cep,
			String cpf,
			String horarioEntrega
			) {
		super(nome, telefone, email, rua, numeroCasa, cep);
		this.cpf = cpf;
		this.horarioEntrega = horarioEntrega;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getHorarioEntrega() {
		return horarioEntrega;
	}

	public void setHorarioEntrega(String horarioEntrega) {
		this.horarioEntrega = horarioEntrega;
	}

	public void infoEntregas() {
		System.out.printf("\n\tO horário de entrega para o cliente %s é %s."
				+ "\n\tA entrega deverá ser realizada em %s, %d - CEP%d\n",
				getNome(),getHorarioEntrega(),getRua(),getNumeroCasa(), getCep());
	}
}
