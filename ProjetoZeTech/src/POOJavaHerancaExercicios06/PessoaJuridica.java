package POOJavaHerancaExercicios06;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private boolean temVeiculo;
	
	public PessoaJuridica(
			String nome,
			String telefone,
			String email,
			String rua,
			int numeroCasa,
			Integer cep,
			String cnpj,
			boolean temVeiculo
			) {
		super(nome, telefone, email, rua, numeroCasa, cep);
		this.cnpj = cnpj;
		this.temVeiculo = temVeiculo;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean isTemVeiculo() {
		return temVeiculo;
	}

	public void setTemVeiculo(boolean temVeiculo) {
		this.temVeiculo = temVeiculo;
	}

	public void infoEntregas() {
		if(!temVeiculo)
			System.out.printf("\n\tA empresa %s NÃO possui veículo para retirada."
					+ "\n\tA entrega deverá ser realizada em %s, %d - CEP%d\n",
					getNome(),getRua(),getNumeroCasa(), getCep());
		else
			System.out.printf("\n\tA empresa %s POSSUI veículo para retirada."
					+ "\n\tO telefone para agendamento é %s.\n",
					getNome(), getTelefone());
	}
	
	
}
