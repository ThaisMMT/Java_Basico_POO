package exemplos;

public class Cliente_Public {
 	//atributos de instância com public
	public int idCliente;
	public String nomeCliente;
	public String cpfCliente;
	// atributo de instância com valor default
	public double limiteCliente;

// ---------------------METODO PARA EXIBIR LIMITE---------------------------------------------
	public void exibeLimite() {
		System.out.println("Limite: " + limiteCliente);
	}
	
// ---------------------METODO PARA EXIBIR NOME---------------------------------------------	
	public void exibeNome() {
		System.out.println("Nome: " + nomeCliente);
	}
}
