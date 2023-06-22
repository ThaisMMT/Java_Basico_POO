package exemplos;

public class Lojinha_Private {

	public static void main(String[] args) {
		// cria um novo cliente
		Cliente_Private jose = new Cliente_Private();
		
		// declara os dados que o objeto vai receber de forma private
		jose.setIdCliente(15);
		jose.setNomeCliente("Jose");
		jose.setCpfCliente("111.111.111-11");
		jose.setLimiteCliente(5000.0);
			
		System.out.println("\nid......."+jose.getIdCliente());
		System.out.println("Nome......."+jose.getNomeCliente());
		System.out.println("CPF......."+jose.getCpfCliente());
		System.out.println("limite......"+jose.getLimiteCliente());
		
		
		String x = jose.getNomeCliente().toUpperCase(); //deixa em letra maiuscula
		System.out.println("\n"+x);
	
	}

}
