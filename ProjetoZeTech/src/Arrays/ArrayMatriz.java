package Arrays;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numeros[][] = new int[2][3];
		int somaNumeros = 0;
		String name = "wagner";
		
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um número inteiro qualquer: ");
				numeros[linha][coluna] = ler.nextInt();
				somaNumeros += numeros[linha][coluna];
			}
		}
		System.out.printf("Soma total: %d", somaNumeros);
	}

}
