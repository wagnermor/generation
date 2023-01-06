package POOJavaHerancaExercicios06;
import java.util.*;

public class Cliente2 {
	private String nome;
	private String telefone;
	private String email;
	private String rua;
	private int numeroCasa;
	private Integer cep;
	
	public Cliente2(
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

public class PessoaFisica2 extends Cliente2{
	private String cpf;
	private String horarioEntrega;
	
	public PessoaFisica2(
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

public class PessoaJuridica2 extends Cliente2{
	private String cnpj;
	private boolean temVeiculo;
	
	public PessoaJuridica2(
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


public class TestaCliente2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente2 cli01 = new Cliente2(
				"Tim Maia",
				"(21)2345-4321",
				"timm@gmail.com",
				"Rua da Música",
				171,
				69852154
				);
		
		PessoaFisica2 pf01 = new PessoaFisica2(
				"Ribamar Ruoni",
				"(11)7894-3654",
				"ribama@gmail.com",
				"Rua Moema",
				896,
				06023453,
				"365.325.987-52",
				"das 10h às 16h");
		PessoaFisica2 pf02 = new PessoaFisica2(
				"Adamastor Carbonato",
				"(11)9 7632-8521",
				"adamastor@gmail.com",
				"Rua Piracicaba",
				862,
				12544487,
				"741.365.999-22",
				"das 09h às 18h");
		
		PessoaJuridica2 loja01 = new PessoaJuridica2(
				"Loja Compra mais",
				"(11)8752-2457",
				"compramais@gmail.com",
				"Rua Tabapuã",
				12,
				12345879,
				"72.198.845/0001-54",
				false);
		PessoaJuridica2 loja02 = new PessoaJuridica2(
				"Loja do Dourada",
				"(11)8888-9999",
				"dourada@gmail.com",
				"Rua Da Forturna",
				999,
				12244888,
				"78.987.888/0001-99",
				true);
		//Cliente
		cli01.visualizar();
		//PessoaFisica
		pf01.visualizar();
		pf01.infoEntregas();
		pf02.visualizar();
		pf02.infoEntregas();
		//PessoaJuridica
		loja01.visualizar();
		loja01.infoEntregas();
		loja02.visualizar();
		loja02.infoEntregas();
	}
}
