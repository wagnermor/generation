package POOJavaHerancaExercicios06;
import java.util.*;
public class TestaCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente cli01 = new Cliente(
				"Tim Maia",
				"(21)2345-4321",
				"timm@gmail.com",
				"Rua da Música",
				171,
				69852154
				);
		
		PessoaFisica pf01 = new PessoaFisica(
				"Ribamar Ruoni",
				"(11)7894-3654",
				"ribama@gmail.com",
				"Rua Moema",
				896,
				06023453,
				"365.325.987-52",
				"das 10h às 16h");
		PessoaFisica pf02 = new PessoaFisica(
				"Adamastor Carbonato",
				"(11)9 7632-8521",
				"adamastor@gmail.com",
				"Rua Piracicaba",
				862,
				12544487,
				"741.365.999-22",
				"das 09h às 18h");
		
		PessoaJuridica loja01 = new PessoaJuridica(
				"Loja Compra mais",
				"(11)8752-2457",
				"compramais@gmail.com",
				"Rua Tabapuã",
				12,
				12345879,
				"72.198.845/0001-54",
				false);
		PessoaJuridica loja02 = new PessoaJuridica(
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
