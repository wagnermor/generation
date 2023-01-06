package POOJava05Exercicios;

public class Curso {
	private String nome;
	private String nomeProfessor;
	private String horario;
	private int duracao;
	private int numeroAlunos;
	private double valor;
	
	public Curso(){}
	
	public Curso(
			String nome,
			String nomeProfessor,
			String horario,
			int duracao,
			int numeroAlunos,
			double valor
			){
		
		super();
		this.nome = nome;
		this.nomeProfessor = nomeProfessor;
		this.horario = horario;
		this.duracao = duracao;
		this.numeroAlunos = numeroAlunos;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getNumeroAlunos() {
		return numeroAlunos;
	}

	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		System.out.printf("\n\tNome do Curso: %s\n\tProfessor: %s\n\tHorário: %s\n\tDuração: %d"
				+ "\n\tNúmero de alunos: %d\n\tValor: R$%.2f\n", getNome(),
				getNomeProfessor(), getHorario(), getDuracao(), getNumeroAlunos(),getValor());
	}
}
