package LacosDeRepeticao;

import java.util.Scanner;

public class LacosDeRepeticao {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Exercicio 1
		
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
		
		//Exercicio 3
		
		/*int idade,genero,categoria,qtdBack=0,qtdMFront=0,qtdHMobile40=0,qtdMFullStack30=0;
		String op = "S";
		while(op.equals("S"))
		{
			
			System.out.println("\nEntre com a sua idade: ");
			idade=leia.nextInt();
			System.out.println("\nEntre com o seu genero: ");
			System.out.println("\n1- Masculino\t 2- Feminino\t 3-Outros");
			genero=leia.nextInt();	
			System.out.println("\nEntre com a sua categoria: ");
			System.out.println("\n1- Backend\t 2- Frontend\t 3- Mobile\t 4- FullStack");
			categoria=leia.nextInt();
			
			if(categoria == 1)
			{
				qtdBack++;
			}
			else if(genero == 2 && categoria == 2)
			{
				qtdMFront++;
			}
			else if(genero == 1 && categoria == 3 && idade>40)
			{
				qtdHMobile40++;
			}
			else if(genero == 2 && categoria == 4 && idade<30)
			{
				qtdMFullStack30++;
			}
			
			System.out.println("\nDeseja cadastrar um novo colaboradore: (S-Sim e N-NÃ£o)? ");
			op = leia.next();
			//op=leia.nextLine();
		}
		
		System.out.println("\nTemos: " + qtdBack + " pessoas desenvolvedoras Backend");
		System.out.println("\nTemos: " + qtdMFront + " mulheres desenvolvedoras FrontEnd");
		System.out.println("\nTemos: " + qtdHMobile40 + " homens desenvolvedores Mobile maiores de 40 anos");
		System.out.println("\nTemos: " + qtdMFullStack30 + " mulheres desenvolvedoras FullStack menores de 30 anos");*/


	}
}
