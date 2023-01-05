package Arrays;

import java.util.Scanner;

public class ExerciciosArray_12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		//Exercício 1
		
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		
		System.out.printf("Digite o número que você deseja encontrar: ");
		numero = reader.nextInt();
		
		for(int x = 0; x < numeros.length; x++) {
			if(numeros[x] == numero) {
				System.out.printf("O número %d está localizado na posição: %d", numeros[x], x);
				break;
			}
			else if(x == numeros.length - 1)
				System.out.printf("\nO número %d não foi encontrado!", numero);
			
		}
		
		//Exercício 2
		
		int numeros02[] = {2,5,1,3,4,9,7,8,10,6};
		float somaNumeros02 = 0;
		float mediaNumeros02;
		
		System.out.println("Elementos nos índices ímpares: ");
		for(int x = 0; x < numeros02.length; x++) {
			if(x % 2 == 1)
				System.out.printf("%d ", numeros02[x]);
		}
		
		System.out.println("\nElementos pares: ");
		for(int x = 0; x < numeros02.length; x++) {
			if(numeros02[x] % 2 == 0)
				System.out.printf("%d ", numeros02[x]);
			somaNumeros02 += numeros02[x];
		}
		mediaNumeros02 = somaNumeros02 / numeros02.length;
		
		System.out.println("\n\nSoma: " + somaNumeros02);
		System.out.printf("Média: %.2f", mediaNumeros02);
		
		//Exercício 3
		
		int matriz03[][] = {{6,2,9},{4,5,6},{7,8,9}};
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int x = 0; x < matriz03.length; x++) {
			System.out.printf("\t%d", matriz03[x][x]);
			somaDiagonalPrincipal += matriz03[x][x];
		}
		
		System.out.println("\nElementos da Diagonal Secundária:");
		for(int x = 0; x < matriz03.length; x++ ) {
			System.out.printf("\t%d", matriz03[x][3-1-x]);
			somaDiagonalSecundaria += matriz03[x][3-1-x];
		}
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d", somaDiagonalPrincipal);
		System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d", somaDiagonalSecundaria);
		
		//Exercício 4
		
		double notas[][] = 
			{
				{4,5,7,3},
				{2.5,6.5,4.7,8},
				{10,8.5,9.5,8},
				{9,6.5,7.6,8,2},
				{5,5,5,6.3},
				{7,8,9,8.5},
				{5.5,3.5,2.5,1},
				{8,9,10,9.5},
				{5.6,5.8,6.5,7},
				{7.5,8.5,9.5,10}
			};
		double media[] = new double[10];
		
		System.out.println("\nExercício 4:\n");
		
		for(int x = 0; x < 10; x++) {
			double somaNotas = 0;
			
			for(int i = 0; i < 4; i++)
				somaNotas += notas[x][i];
			
			media[x] = somaNotas / 4;
			
			System.out.printf("%.1f | ", media[x]);
		}
	}
}
