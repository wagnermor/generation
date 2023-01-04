package LacosDeRepeticao;

import java.util.Scanner;

public class LacosDeRepeticao {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Exercicio 1 -----------------------------------
		
		int firstNumber;
		int lastNumber;
				
		do {
			System.out.println("Digite o primeiro número do intervalo: ");
			firstNumber = leia.nextInt();
			System.out.println("Digite o último número do intervalo: ");
			lastNumber = leia.nextInt();
			
			if(firstNumber > lastNumber)
				System.out.println("Intervalo inválido!");
			
			for(int i = firstNumber; i < lastNumber; i++) {				
				if(i % 3 == 0 && i % 5 == 0)
					System.out.println(i + " é múltiplo de 5 e 3");
			}
		}while(firstNumber < lastNumber);
		
		//Exercício 2 -----------------------------------
		
		int number;
		int totalPairNumbers = 0;
		int totalOddNumbers = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número: ");
			number = leia.nextInt();
			
			if(number % 2 == 0 && number >= 0)
				totalPairNumbers++;
			else if(number > 0)
				totalOddNumbers++;
		}
		
		System.out.println("Total de números pares: " + totalPairNumbers);
		System.out.println("Total de números ímpares: " + totalOddNumbers);
		
		//Exercicio 3 -----------------------------------
		
		int idadeEx3 = 0;
		int totalMenor21 = 0;
		int totalMaior50 = 0;
		
		System.out.println("\n\tExercício 3\n");
		
		while(idadeEx3 >= 0) {
			System.out.println("Digite uma idade: ");
			idadeEx3 = leia.nextInt();
			
			if(idadeEx3 < 21 && idadeEx3 > 0)
				totalMenor21++;
			else if(idadeEx3 > 50)
				totalMaior50++;
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + totalMenor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + totalMaior50);
		
		//Exercícios 4 -----------------------------------
		
		int idadeEx4;
		int sexo;
		int categoria;
		int totalPessoasBackEnd = 0;
		int totalMulheresFront = 0;
		int totalHomensMobileMaior40 = 0;
		int totalMulheresFullStackMenores30 = 0;
		
		String controll = "s";
		
		while(controll.equals("s")){
			System.out.println("Digite a idade do colaborador: ");
			idadeEx4 = leia.nextInt();
			
			System.out.println("\nDigite:");
			System.out.println("1 - Masculino | 2 - Feminino | 3 - Outros");
			sexo = leia.nextInt();
			
			System.out.println("\nDigite: ");
			System.out.println("1 - Backend | 2 - Frontend | 3 - Mobile | 4 - FullStack");
			categoria = leia.nextInt();
			
			if(categoria == 1)
				totalPessoasBackEnd++;
			else if(sexo == 2 && categoria == 2)
				totalMulheresFront++;
			else if(sexo == 1 && categoria == 3 && idadeEx4 > 40)
				totalHomensMobileMaior40++;
			else if(sexo == 2 && categoria == 4 && idadeEx4 < 30)
				totalMulheresFullStackMenores30++;
			
			System.out.println("Deseja continuar a leitura de um novo colaborador: (S/Sim - N/Não)?");
			controll = leia.next().toLowerCase();
		}
		
		System.out.println("O número de pessoas desenvolvedoras Backend: " + totalPessoasBackEnd);
		System.out.println("O número de mulheres desenvolvedoras Frontend: " + totalMulheresFront);
		System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobileMaior40);
		System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + totalMulheresFullStackMenores30);
		
		//Exercício 5 -----------------------------------
		
		int theNumber;
		int somaTheNumber = 0;
		
		do {
			System.out.printf("Digite um número: ");
			theNumber = leia.nextInt();
			
			if(theNumber > 0 || theNumber < 0)
				somaTheNumber += theNumber;
			
		}while(theNumber != 0);
		
		System.out.println("A soma dos números positivos é: " + somaTheNumber);
		
		//Exercício 6 -----------------------------------
		
		double somaNumeros = 0;
		double mediaNumeros;
		
		int numeroEx6;
		int totalDeNumeros = 0;
				
		do {
			System.out.printf("Digite um número: ");
			numeroEx6 = leia.nextInt();
			
			if(numeroEx6 % 3 == 0 && numeroEx6 != 0) {		
				somaNumeros += numeroEx6;
				totalDeNumeros++;
			}
			
		}while(numeroEx6 != 0);
		
		mediaNumeros = somaNumeros / totalDeNumeros;
		
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", mediaNumeros);
	}
}
