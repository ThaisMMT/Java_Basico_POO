package exemplos;

public class Lojinha_Public {
	public static void main(String[] args) {
		// cria um novo cliente
		Cliente_Public maria = new Cliente_Public();
		new Cliente_Public();
		
		//utilizado quando o atributo está como public
		maria.idCliente = 25;
		maria.nomeCliente = "Maria";
		maria.cpfCliente = "222.222.222-22";
		maria.limiteCliente = 2000.0;
		
		// invoca metodos de outra classe
		maria.exibeLimite();
		maria.exibeNome();
		
		System.out.println("\nid......."+maria.idCliente);
		System.out.println("Nome......."+maria.nomeCliente);
		System.out.println("CPF......."+maria.cpfCliente);
		System.out.println("limite......"+maria.limiteCliente);
		
		
	}
}
