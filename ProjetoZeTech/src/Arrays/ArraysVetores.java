package Arrays;

import java.util.Scanner;

public class ArraysVetores {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float media[] = new float[4];
		float n1;
		float n2;
		float n3;
		float somaMedia = 0;
		float mediaGeral = 0;
		
		for(int x = 0; x < 3; x++) {
			System.out.printf("Digite a primeira nota: ");
			n1 = read.nextFloat();
			System.out.printf("Digite a segunda nota: ");
			n2 = read.nextFloat();
			System.out.printf("Digite a terceira nota: ");
			n3 = read.nextFloat();
			
			media[x] = (n1 + n2 + n3) /3;
			somaMedia += media[x];
			System.out.printf("\nMédia do aluno %d: %.2f\n\n", x + 1, media[x]);
		}
		
		mediaGeral = somaMedia / 3;
		System.out.printf("Média geral: %.2f", mediaGeral);
	}

}
