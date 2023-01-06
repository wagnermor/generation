new
package POOJava05Exercicios;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente cli001 = new Cliente(
				"Covidelson",
				"covidelson@gmail.com",
				"Lapa",
				"São Paulo",
				"SP",
				61819451,
				99
				);
		
		Cliente cli002 = new Cliente(
				"Romanov",
				"romanov@gmail.com",
				"Dumbrava",
				"Kishinev",
				"Kishinev",
				478412221,
				51
				);
		
		cli001.visualizar();
		cli002.visualizar();
	}

}
