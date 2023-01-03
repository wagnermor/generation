package LacosCondicionais;

import java.util.*;

public class LacosCondicionaisJava02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		//Exercicio 1
		double number;
		String par;
		String positivo;

		System.out.println("\n\nExercício 1");
		System.out.println("Digite um número: ");

		number = ler.nextDouble();
		
		if(number % 2 == 0 && number >= 0) {
			System.out.printf("O número %f é par e positivo", number);
		}
		else if(number % 2 == 0 && number < 0) {
			System.out.printf("O número %f é par e negativo", number);
		}
		else if(number % 2 != 0 && number >= 0) {
			System.out.printf("O número %f é ímpar e positivo", number);
		}
		else {
			System.out.printf("O número %f é ímpar e negativo", number);
		}
		
		//2º forma de resolver

		if (number % 2 == 0){
			par = "par";
		}else {
			par = "impar";
		}
		

		if (number < 0)
			positivo = "negativo";
		else
			positivo = "positivo";

		System.out.printf("\nO número %.2f é %s e %s.", number, par, positivo);
		
		//Exercicio 2
		
		int codigo;
		int qnt;
		float valorTotal;
		String produto;

		System.out.println("\n\nExercício 2");
		System.out.println("\n1 - Cachorro-quente - R$10,00");
		System.out.println("2 - X-Salada -------- R$15,00");
		System.out.println("3 - X-Bacon --------- R$18,00");
		System.out.println("4 - Bauru ----------- R$12,00");
		System.out.println("5 - Refrigerante ---- R$8,00");
		System.out.println("6 - Suco de Laranja - R$13,00");
		
		System.out.println("\nCódigo do Produto: ");
		codigo = ler.nextInt();
		System.out.println("Quantidade: ");
		qnt = ler.nextInt();
		
		if(codigo == 1) {
			valorTotal = qnt * 10;
			produto = "Cachorro-quente";
		}else if(codigo == 2) {
			valorTotal = qnt * 15;
			produto = "X-Salada";
		}else if(codigo == 3) {
			valorTotal = qnt * 18;
			produto = "X-Bacon";
		}else if(codigo == 4) {
			valorTotal = qnt * 12;
			produto = "Bauru";
		}else if(codigo == 5) {
			valorTotal = qnt * 8;
			produto = "Refrigerante";
		}else if(codigo == 6) {
			valorTotal = qnt * 13;
			produto = "Suco de Laranja";
		}else {
			valorTotal = 0;
			produto = "Código inválido";
		}		
		
		System.out.printf("Produto: %s\nValor total: R$ %.2f", produto, valorTotal);
		
		//Exercicio 3
		
		int idade;
		
		System.out.println("\n\nExercício 3");
		System.out.println("\nDigite a idade: ");
		idade = ler.nextInt();
		
		if(idade >= 16 && idade < 18 || idade > 65)
			System.out.println("A pessoa está apta a votar e o voto é facultativo.");
		else if(idade >= 18 && idade <= 65)
			System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
		else if(idade > 0)
			System.out.println("Apessoa não está apta a votar.");
		else
			System.out.println("Idade inválida.");
		
		//Exercicio 4
		
		double salario;
		double imposto = -1;
		
		System.out.println("\n\nExercício 4");
		System.out.println("\nDigite o Salário: ");
		salario = ler.nextDouble();
		
		if(salario >= 0 && salario <= 2000)
			imposto = 0;
		else if(salario >= 2000.01 && salario <= 3000)
			imposto = salario * 0.08;
		else if(salario >= 3000.01 && salario < 4500)
			imposto = salario * 0.18;
		else if(salario > 4500)
			imposto = salario * 0.28;
		
		if(imposto == 0)
			System.out.printf("Imposto de Renda: Isento");
		else if(imposto > 0)
			System.out.printf("Imposto de Renda: R$%.2f", imposto);
		else
			System.out.println("Digite um salário positivo!");
		
		//Exercio 5
		
		String primeiraPalavra;
		String segundaPalavra;
		String terceiraPalavra;
		String animal = "";
		
		System.out.println("\n\nExercício 5:");
		System.out.println("\nDigite a primeira palavra: ");
		primeiraPalavra = ler.nextLine();
		
		System.out.println("Digite a segunda palavra: ");
		segundaPalavra = ler.nextLine();
		
		System.out.println("Digite a terceira palavra: ");
		terceiraPalavra = ler.nextLine();
		
		if(primeiraPalavra == "vertebrado" && segundaPalavra == "ave" && terceiraPalavra == "carnivoro")
			animal = "Águia";
		else if(primeiraPalavra == "vertebrado" && segundaPalavra == "ave" && terceiraPalavra == "onivoro")
			animal = "Pomba";
		else if(primeiraPalavra == "vertebrado" && segundaPalavra == "mamifero" && terceiraPalavra == "onivoro")
			animal = "Homem";
		else if(primeiraPalavra == "vertebrado" && segundaPalavra == "mamifero" && terceiraPalavra == "herbivero")
			animal = "Vaca";
		else if(primeiraPalavra == "invertebrado" && segundaPalavra == "inseto" && terceiraPalavra == "hematofago")
			animal = "Pulga";
		else if(primeiraPalavra == "invertebrado" && segundaPalavra == "inseto" && terceiraPalavra == "carnivoro")
			animal = "Lagarta";
		else if(primeiraPalavra == "invertebrado" && segundaPalavra == "anelideo" && terceiraPalavra == "hematofago")
			animal = "Sanguessuga";
		else if(primeiraPalavra == "invertebrado" && segundaPalavra == "anelideo" && terceiraPalavra == "onivoro")
			animal = "Minhoca";
		
		System.out.printf(animal);
	}

}
